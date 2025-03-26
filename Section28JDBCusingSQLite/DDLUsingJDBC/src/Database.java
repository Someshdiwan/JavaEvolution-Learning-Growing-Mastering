import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

        Statement stm = con.createStatement();

        //stm.executeUpdate("create table Temp(a integer, b float)");

        //stm.executeUpdate("drop table Temp");

        stm.close();
        con.close();
    }
}