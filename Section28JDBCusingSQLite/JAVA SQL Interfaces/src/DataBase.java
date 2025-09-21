import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/univ.db"
        );

        System.out.println("Connection Established!");

        //Connection object and con are an interface.
        Statement stm = con.createStatement();

        //the entire table name means the output of the table we stored.
        ResultSet rs = stm.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            System.out.print(rs.getInt("roll") + " | ");
            System.out.print(rs.getString("name") + " | ");
            System.out.print(rs.getString("city") + " ");
            System.out.println(rs.getInt("deptno")+" | ");
        }
        stm.close();
        con.close();
        System.out.println("Connection Closed.");
    }
}
