import java.sql.*;

class DataBase {
    public static void main(String[] args) {
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish the connection to your database.
            // Add a path. to yur DB
            Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/univ.db");

            // Create a statement object to execute the query
            Statement stm = con.createStatement(); //It Creates-select statement.

            // Execute the query (ensure the SQL statement is enclosed in quotes)
            ResultSet rs = stm.executeQuery("SELECT * FROM dept");

            // Loop through the results and print them
            while(rs.next()) {
                int dno = rs.getInt("deptno");
                String name = rs.getString("name"); // Use the actual column name from your schema
                System.out.println(dno + " " + name);
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

/*
1. Driver Loading:
   - Class.forName("org.sqlite.JDBC") → SQLite JDBC driver ko load karta hai.
   - Ye step ensure karta hai ki Java ko pata ho driver available hai.

2. Connection:
   - DriverManager.getConnection("jdbc:sqlite:/path/univ.db")
   - Database ke saath connection establish hota hai.
   - Agar file exist nahi karti, SQLite nayi DB file create kar deta hai.

3. Statement:
   - Statement stm = con.createStatement();
   - SQL queries (SELECT, INSERT, UPDATE, DELETE) ko run karne ke liye object banaya.

4. Execute Query:
   - ResultSet rs = stm.executeQuery("SELECT * FROM dept");
   - SELECT query run hoti hai, aur result rows `ResultSet` object me store hote hain.

5. Result Traversal:
   - rs.next() → cursor ko next row par le jata hai.
   - rs.getInt("deptno"), rs.getString("name") → column ke values fetch karte hain.
   - Har row ka department number aur name print hota hai.

6. Cleanup:
   - rs.close(), stm.close(), con.close();
   - Resources release karna jaroori hai taaki memory aur DB locks free ho jayein.

✔ JDBC flow: Driver load → Connection → Statement → Execute → ResultSet → Close.
✔ Ye program dept table se saare rows fetch karke console pe print karta hai.
✔ SQLite agar path valid hai toh local file DB se connect ho jata hai.
*/
