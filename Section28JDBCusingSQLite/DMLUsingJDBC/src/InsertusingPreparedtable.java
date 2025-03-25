import java.sql.*;
import java.util.Scanner;

public class InsertusingPreparedtable {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

        PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a values to insert into the student data: ");
        int r = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        int dno = sc.nextInt();

        stm.setInt(1, r);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setInt(4, dno);

        stm.executeUpdate();
        //It is useful we change the data anf executed many times.

        stm.close();;
        con.close();
    }
}