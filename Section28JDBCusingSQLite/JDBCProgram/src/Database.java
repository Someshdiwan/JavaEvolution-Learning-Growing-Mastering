import java.sql.*;

class DataBase {
    public static void main(String[] args) {
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish the connection to your database
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

            // Create a statement object to execute the query
            Statement stm = con.createStatement();

            // Execute the query (ensure the SQL statement is enclosed in quotes)
            ResultSet rs = stm.executeQuery("SELECT * FROM dept");

            // Loop through the results and print them
            while(rs.next()) {
                int dno = rs.getInt("deptno");
                String dnmae = rs.getString("dnmae"); // Use the actual column name from your schema
                System.out.println(dno + " " + dnmae);
            }

            // Clean up resources
            rs.close();
            stm.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}