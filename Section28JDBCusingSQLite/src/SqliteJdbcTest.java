import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
public class SqliteJdbcTest {
    public static void main(String[] args) {
        Path dbPath = Paths.get("/Users","somesh","Java SE","JavaEvolution-Learning-Growing-Mastering","Section28JDBCusingSQLite","test.db");
        String url = "jdbc:sqlite:" + dbPath.toString();
        System.out.println("JDBC URL: " + url);
        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection conn = DriverManager.getConnection(url)) {
                System.out.println("Connected (driver: " + conn.getMetaData().getDriverName() + ")");
                try (Statement st = conn.createStatement()) {
                    st.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INTEGER PRIMARY KEY, name TEXT);");
                    st.executeUpdate("INSERT INTO student(name) VALUES('Diwan');");
                    try (ResultSet rs = st.executeQuery("SELECT id, name FROM student;")) {
                        while (rs.next()) System.out.println("row -> id: " + rs.getInt("id") + ", name: " + rs.getString("name"));
                    }
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
