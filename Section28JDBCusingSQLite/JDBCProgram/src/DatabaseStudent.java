import java.sql.*;

class DatabaseStudent {
    public static void main(String[] args) {
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish the connection to your database.
            // Add a path. to yur DB
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

            // Create a statement object to execute the query
            Statement stm = con.createStatement(); //It Create-select statement.

            // Execute the query (ensure the SQL statement is enclosed in quotes)
            ResultSet rs = stm.executeQuery("SELECT * FROM students");


            // Loop through the results and print them
            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");  // Fixed: "name" instead of "nmae"
                String city = rs.getString("city");
                int deptno = rs.getInt("deptno");

                System.out.println(roll + " | " + name + " | " + city + " | " + deptno);
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