# Setting Up SQLite + JDBC on macOS (Apple Silicon) with IntelliJ.

This is a clear, practical guide for setting up **SQLite CLI tools** and the **Xerial ****\`\`**** driver** on an **Apple Silicon Mac** with **IntelliJ IDEA**. It is written to be copy-paste friendly, including for project paths that contain spaces (like `Java SE`).

> Target audience: macOS (Apple Silicon / arm64) users running Java 11+ with IntelliJ IDEA (Community or Ultimate).

---

## Overview

By the end of this guide you will have:

- SQLite **command-line tools** (arm64 precompiled binaries) in your project folder for direct database inspection.
- The **sqlite-jdbc** JAR added to your IntelliJ module so Java can connect to SQLite.
- A working Java test that creates `test.db`, inserts data, and reads it back.
- Tips to prevent duplicate inserts, run in-memory tests, and silence JDK 24 native-access warnings.

---

## Prerequisites

- macOS on **Apple Silicon** (M1/M2/M3). If you are on Intel, use the x64 binaries instead.
- Java JDK 11+ (JDK 17 or 21 recommended; JDK 24 is supported with an extra VM option).
- IntelliJ IDEA installed.

Project directory example used throughout:

```bash
PROJECT_DIR="/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite"
```

> Since this path contains spaces, commands are quoted.

---

## 1. Install SQLite CLI Tools (ARM64)

Download the arm64 precompiled binaries (e.g. `sqlite-tools-osx-arm64-3500400.zip`) from the [SQLite downloads page](https://www.sqlite.org/download.html).

Unzip, and you should see:

- `sqlite3`
- `sqldiff`
- `sqlite3_analyzer`
- `sqlite3_rsync`

---

## 2. Add CLI Tools to Your Project

Copy the tools into your project:

```bash
cd "$PROJECT_DIR"
mkdir -p sqlite-tools
cp -R ~/Downloads/sqlite-tools-osx-arm64-3500400/* sqlite-tools/
```

Make them executable and verify:

```bash
cd "$PROJECT_DIR/sqlite-tools"
chmod +x sqlite3 sqldiff sqlite3_analyzer sqlite3_rsync || true
"$PROJECT_DIR/sqlite-tools/sqlite3" --version
```

---

## 3. Download the JDBC Driver

Get the Xerial `sqlite-jdbc` JAR (example version `3.50.3.0`):

```bash
cd "$PROJECT_DIR"
curl -L -o sqlite-jdbc-3.50.3.0.jar "https://downloads.sourceforge.net/project/sqlite-jdbc-driver.mirror/3.50.3.0/sqlite-jdbc-3.50.3.0.jar"
ls -lh sqlite-jdbc-3.50.3.0.jar
```

---

## 4. Add the JAR in IntelliJ

1. Open IntelliJ → `File` → `Project Structure...` (⌘;).
2. Under **Modules**, select your module.
3. Open the **Dependencies** tab → click `+` → **JARs or Directories...**.
4. Choose `sqlite-jdbc-3.50.3.0.jar`.
5. Set Scope = **Compile**. Apply → OK.

---

## 5. Mark `src` as Source Root

In Project Structure → Modules → **Sources** tab, select your `src` folder and click **Mark as Sources** (blue folder). IntelliJ will now compile your `.java` files.

---

## 6. Example Java Test Program

Place `SqliteJdbcTest.java` inside `src/`:

```java
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

public class SqliteJdbcTest {
    public static void main(String[] args) {
        Path dbPath = Paths.get("/Users", "somesh", "Java SE", "JavaEvolution-Learning-Growing-Mastering", "Section28JDBCusingSQLite", "test.db");
        String url = "jdbc:sqlite:" + dbPath;

        System.out.println("JDBC URL: " + url);

        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection conn = DriverManager.getConnection(url)) {
                System.out.println("Connected (driver: " + conn.getMetaData().getDriverName() + ")");
                try (Statement st = conn.createStatement()) {
                    st.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INTEGER PRIMARY KEY, name TEXT);");
                    st.executeUpdate("INSERT INTO student(name) VALUES('Diwan');");
                    try (ResultSet rs = st.executeQuery("SELECT id, name FROM student;")) {
                        while (rs.next()) {
                            System.out.println("row -> id: " + rs.getInt("id") + ", name: " + rs.getString("name"));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## 7. Run from Terminal

```bash
cd "$PROJECT_DIR"
javac src/SqliteJdbcTest.java
java -cp ".:sqlite-jdbc-3.50.3.0.jar" SqliteJdbcTest
```

Expected output: connection success + printed rows.

---

## 8. Run in IntelliJ

1. Run → Edit Configurations... → `+` → Application.
2. Name: `SqliteJdbcTest`.
3. Main class: `SqliteJdbcTest`.
4. Use classpath of module: your module name.
5. Working directory: `$PROJECT_DIR`.

Run and confirm output matches.

---

## 9. Handle JDK 24 Warnings

Add this VM option to silence restricted method warnings:

```
--enable-native-access=ALL-UNNAMED
```

Add via Run Configurations → Modify options → VM options.

---

## 10. Inspect Database with CLI

```bash
"$PROJECT_DIR/sqlite-tools/sqlite3" test.db ".tables"
"$PROJECT_DIR/sqlite-tools/sqlite3" test.db "SELECT * FROM student;"
"$PROJECT_DIR/sqlite-tools/sqlite3" test.db ".schema"
```

---

## 11. Prevent Duplicate Inserts

**Option A — UNIQUE + OR IGNORE:**

```sql
CREATE TABLE IF NOT EXISTS student (id INTEGER PRIMARY KEY, name TEXT UNIQUE);
INSERT OR IGNORE INTO student(name) VALUES('Diwan');
```

**Option B — UPSERT:**

```sql
INSERT INTO student(name) VALUES('Diwan') ON CONFLICT(name) DO NOTHING;
```

**Option C — Check in Java:** (Use `SELECT COUNT(*)` before inserting.)

---

## 12. Reset the Test DB

Delete file:

```bash
rm -f "$PROJECT_DIR/test.db"
```

Or drop table:

```bash
"$PROJECT_DIR/sqlite-tools/sqlite3" test.db "DROP TABLE IF EXISTS student;"
```

---

## 13. JUnit 5 In-Memory Tests

Use `jdbc:sqlite::memory:` to avoid touching disk.

```java
import org.junit.jupiter.api.*;
import java.sql.*;
import static org.junit.jupiter.api.Assertions.*;

class SqliteInMemoryTest {
    private Connection conn;

    @BeforeEach
    void openConnection() throws Exception {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite::memory:");
    }

    @AfterEach
    void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) conn.close();
    }

    @Test
    void createAndQuery() throws SQLException {
        try (Statement st = conn.createStatement()) {
            st.executeUpdate("CREATE TABLE student (id INTEGER PRIMARY KEY, name TEXT);");
            st.executeUpdate("INSERT INTO student(name) VALUES('Alice');");
            try (ResultSet rs = st.executeQuery("SELECT id, name FROM student")) {
                assertTrue(rs.next());
                assertEquals("Alice", rs.getString("name"));
            }
        }
    }
}
```

---

## 14. Add sqlite-tools to PATH (Optional)

Edit `~/.zshrc`:

```bash
export PATH="/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/sqlite-tools:$PATH"
```

Reload:

```bash
source ~/.zshrc
sqlite3 --version
```

---

## 15. Troubleshooting

- **No suitable driver found:** Ensure JAR is on classpath or added to module dependencies.
- **ClassNotFoundException: org.sqlite.JDBC:** Wrong or missing jar.
- **UnsatisfiedLinkError:** Use Xerial driver and supported JDK.
- **Permission errors:** Check file ownership/permissions.
- **Paths with spaces:** Quote in shell; use `Paths.get(...)` in Java.
- **JDK 24 warnings:** Add `--enable-native-access=ALL-UNNAMED`.

---

*Happy coding and reproducible builds!*
