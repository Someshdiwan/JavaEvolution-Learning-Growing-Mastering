import java.sql.*;

public class Call {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/univ.db";

        Connection con = DriverManager.getConnection(url);

        // Use PreparedStatement because SQLite does not support stored procedures
        PreparedStatement cst = con.prepareStatement("SELECT * FROM students WHERE deptno = ?");
        cst.setInt(1, 10); // example department

        ResultSet rs = cst.executeQuery();
        while (rs.next()) {
            System.out.printf("%d | %s | %s | %d%n",
                    rs.getInt("roll"),
                    rs.getString("name"),
                    rs.getString("city"),
                    rs.getInt("deptno"));
        }

        rs.close();
        cst.close();
        con.close();
    }
}
