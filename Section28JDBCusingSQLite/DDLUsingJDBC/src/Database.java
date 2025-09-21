import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) throws Exception {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        String url = "jdbc:sqlite:/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/univ.db";
        Connection con = DriverManager.getConnection(url);

        Statement stm = con.createStatement();

        // Uncomment if you want to create a table.
        // stm.executeUpdate("CREATE TABLE Temp(a INTEGER, b FLOAT)");

        // Uncomment if you want to drop a table.
        // stm.executeUpdate("DROP TABLE Temp");

        stm.close();
        con.close();
        System.out.println("Database connected successfully!");
    }
}
