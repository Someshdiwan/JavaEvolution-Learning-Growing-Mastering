import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        //Connection is extablish.
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");
        System.out.println("✅ Connection Established!");


        //Connection object and con is an interface.
        //con.
        Statement stm = con.createStatement();

        //entire table name means the output of table we stored.
        ResultSet rs = stm.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            System.out.print(rs.getInt("roll") + " | ");
            System.out.print(rs.getString("name") + " | ");
            System.out.print(rs.getString("city") + " ");
            System.out.println(rs.getInt("deptno")+" | ");
        }
        stm.close(); //close the statement.
        con.close(); //Connection close.
        System.out.println("✅ Connection Closed.");
    }
}
