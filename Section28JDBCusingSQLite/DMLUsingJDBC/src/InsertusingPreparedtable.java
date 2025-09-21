import java.sql.*;
import java.util.Scanner;

public class InsertusingPreparedtable {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");

        // Use your actual macOS path to univ.db
        String url = "jdbc:sqlite:/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/univ.db";
        Connection con = DriverManager.getConnection(url);

        // Prepared statement for inserting into students.
        PreparedStatement stm = con.prepareStatement(
                "INSERT INTO students (roll, name, city, deptno) VALUES (?, ?, ?, ?)"
        );

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values to insert into the student table (roll name city deptno):");
        int r = sc.nextInt();       // roll number
        String name = sc.next();    // name
        String city = sc.next();    // city
        int dno = sc.nextInt();     // department number

        // Bind parameters
        stm.setInt(1, r);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setInt(4, dno);

        // Execute
        int rows = stm.executeUpdate();
        System.out.println(rows + " row(s) inserted successfully.");

        // Cleanup
        stm.close();
        con.close();
    }
}

/*
1. Classes / Setup:
   - `Class.forName("org.sqlite.JDBC");` → SQLite JDBC driver load karta hai.
   - `DriverManager.getConnection("jdbc:sqlite:.../univ.db");` → SQLite database `univ.db` ke saath connection banata hai.

2. PreparedStatement:
   - Query: `"INSERT INTO students (roll, name, city, deptno) VALUES (?, ?, ?, ?)"`.
   - `?` placeholders use hote hain jahan values runtime pe bind ki jaati hain.
   - Benefits:
     ✔ Prevents SQL Injection.
     ✔ Query pre-compiled hoti hai → fast execution.
     ✔ Reusable with different values.

3. Logic:
   - `Scanner` se user input liya jata hai → roll, name, city, deptno.
   - `stm.setInt(1, r);` → pehle placeholder ko roll assign hota hai.
   - `stm.setString(2, name);` → doosra placeholder = name.
   - `stm.setString(3, city);` → teesra placeholder = city.
   - `stm.setInt(4, dno);` → chautha placeholder = deptno.
   - `executeUpdate()` query ko run karta hai aur number of affected rows return karta hai.

4. Main Method Flow:
   - Connection open hota hai.
   - User input binds hota hai PreparedStatement me.
   - an Insert query executes hoti hai.
   - Console pe output: `"1 row(s) inserted successfully."`
   - Finally `stm.close(); con.close();` resources free kar diye jaate hain.

✔ `PreparedStatement` = safer + faster alternative to `Statement`.
✔ `?` = placeholders jo runtime pe bind hote hain.
✔ SQL Injection se protection milta hai.
✔ `executeUpdate()` DML (INSERT/UPDATE/DELETE) ke liye hota hai.
✔ Hamesha resources close karna zaroori hai (best practice).
*/
