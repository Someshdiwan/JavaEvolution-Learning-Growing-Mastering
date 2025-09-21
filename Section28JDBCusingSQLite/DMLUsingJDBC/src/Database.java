import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/univ.db\"");

        Statement stm = con.createStatement();

        /*
        Inserting a value:
        If you run again then it say, PRIMARY KEY constraint failed (UNIQUE constraint failed: dept.deptno).
        The primary key is Unique and cannot be null.
        stm.executeUpdate("insert into dept values(60,'Chem added using JDBC')");

        stm.executeUpdate("insert into dept values(70,'DML Done Using Insert Query')");

        Perform delete operation
        stm.executeUpdate("DELETE FROM dept WHERE deptno >= 60");

        Update into the database.
        stm.executeUpdate("update dept set dnmae = 'Ai set using JDBC' where deptno=50");
        */

        stm.close();
        con.close();
    }
}

/*
1. JDBC Setup:
   - `Class.forName("org.sqlite.JDBC");`
     → SQLite JDBC driver ko load karta hai.
   - `DriverManager.getConnection("jdbc:sqlite:.../univ.db")`
     → SQLite database file `univ.db` ke saath connection establish karta hai.
     → Agar file exist nahi karti toh SQLite automatically bana deta hai.

2. Statement Object:
   - `Statement stm = con.createStatement();`
     → Isse SQL commands (INSERT, DELETE, UPDATE, SELECT) execute kar sakte ho.

3. Insert Example:
   - `stm.executeUpdate("insert into dept values(60,'Chem added using JDBC')");`
     → `dept` table me ek naya record add karega.
   - Agar firse wahi primary key (deptno = 60) insert karoge →
     PRIMARY KEY constraint failed (UNIQUE constraint failed) error aayega.
   - Reason: Primary key hamesha unique aur non-null hoti hai.

4. Delete Example:
   - `stm.executeUpdate("DELETE FROM dept WHERE deptno >= 60");`
     → `deptno` 60 ya usse upar ke saare rows delete kar dega.

5. Update Example:
   - `stm.executeUpdate("update dept set dname = 'AI set using JDBC' where deptno=50");`
     → Dept number 50 wale record ka naam update ho jayega.

6. Close Resources:
   - `stm.close(); con.close();`
     → Database resources release karna important hai.


✔ INSERT → naye records add karne ke liye.
✔ DELETE → existing records remove karne ke liye.
✔ UPDATE → existing records modify karne ke liye.
✔ PRIMARY KEY constraint → duplicate values allow nahi karega.
✔ Always close connection after queries.
*/
