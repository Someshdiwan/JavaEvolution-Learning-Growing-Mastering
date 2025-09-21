import java.sql.*;
import java.util.Scanner;

public class Statements {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        //Invoke drivers.

        //Connection is Establish.
        // Connection is Established.
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section28JDBCusingSQLite/univ.db"
        );
        System.out.println("Connection Established!");

        PreparedStatement pstm = con.prepareStatement("select * FROM students where deptno=?");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dept No");

        Integer dno = sc.nextInt(); //Read int value.
        pstm.setInt(1, dno);


        ResultSet rs = pstm.executeQuery();

        //isBeforeFirst() Method: Retrieves whether the cursor is before the first row in this ResultSet object.
        if(!rs.isBeforeFirst()) {System.out.println("record not found");}
        else
        {
            while (rs.next()) {
            System.out.print(rs.getInt("roll") + " | ");
            System.out.print(rs.getString("name") + " | ");
            System.out.print(rs.getString("city") + " ");
            System.out.println(rs.getInt("deptno")+" | ");
            }
        }

        /* 7. Check if any records were found */
        boolean recordFound = false;

        // 8. If no records were found, print a message
        /*
        if (!recordFound) {
            System.out.println("❌ No records found for deptno = " + dno);
        }
        */

        pstm.close(); //close the statement.
        pstm.close(); //Connection close.
        System.out.println("Connection Closed.");
    }
}

/*
It is an interface.
We don't create the object directly, we create the object of the Statement using Connection. We handle it using references.

Statement stm = con.createStatement();  // obj of statement we are creating here.

stm.executeQuery("select * from students");
stm.executeUpdate("DML: ");

Three types of Statements:
1. Statement
   - Normal queries run karne ke liye.

2. PreparedStatement
   - How to create: con.prepareStatement();
   - PreparedStatement execute multiple times by changing the parameter.

3. CallableStatement
   - Used for invoking a stored procedure.
   - In some databases, they support some programs along with a database.
*/

/*
1. JDBC Driver Load:
   - `Class.forName("org.sqlite.JDBC");`
   - Isse SQLite JDBC driver memory me load ho jaata hai.
   ✔ Without driver, Java ko DB samajh hi nahi aayega.

2. Connection Establishes:
   - `DriverManager.getConnection("jdbc:sqlite:...univ.db")`
   - SQLite database `univ.db` ke saath connection establish ho jaata hai.
   ✔ Ye bridge hai Java program aur DB ke beech.

3. PreparedStatement:
   - `PreparedStatement pstm = con.prepareStatement("select * FROM students where deptno=?");`
   - Yaha query pre-compiled hoti hai aur hum `?` ke jagah runtime par values inject karte hain.
   ✔ SQL injection avoid karne ke liye safe hai.

4. Input from User:
   - Scanner se dept number input liya jaata hai (`dno`).
   - `pstm.setInt(1, dno);` → query me pehle `?` ke jagah deptno daal diya.

5. Execute Query:
   - `ResultSet rs = pstm.executeQuery();`
   - Database se matching rows return hoti hain.

6. ResultSet Handling:
   - `isBeforeFirst()` → check karta hai ki ResultSet empty hai ya nahi.
   - Agar records mile → loop me har row ke `roll`, `name`, `city`, `deptno` print ho jaate hain.

7. Closing:
   - `pstm.close();`
   - `con.close();` (tumhare code me galti se `pstm.close()` do baar likha hai – ek baar `con.close()` hona chahiye).
   ✔ Always close resources to free DB locks and memory.

✔ Program SQLite database ke `students` table se records fetch karta hai.
✔ User se deptno input leta hai aur sirf us deptno wale students ko print karta hai.
✔ PreparedStatement safe hai (SQL injection nahi hoga).
✔ Properly connection close karke resources release kiye jaate hain.

Ye ek search utility hai. Tum department number enter karte ho, aur program database ke students table me se us
department ke sabhi students ki details print kar deta hai (roll, name, city, deptno).
*/
