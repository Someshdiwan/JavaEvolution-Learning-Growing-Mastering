import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

        Statement stm = con.createStatement();

        //Inserting a value
        //If you run again then it say, PRIMARY KEY constraint failed (UNIQUE constraint failed: dept.deptno).
        //Primary key is Unique and cannot be null.
        //stm.executeUpdate("insert into dept values(60,'Chem added using JDBC')");

        //stm.executeUpdate("insert into dept values(70,'DML Done Using Insert Query')");

        //Perform delete operation
        //stm.executeUpdate("DELETE FROM dept WHERE deptno >= 60");

        //Update into the database.
        //stm.executeUpdate("update dept set dnmae = 'Ai set using JDBC' where deptno=50");

        stm.close();
        con.close();
    }
}