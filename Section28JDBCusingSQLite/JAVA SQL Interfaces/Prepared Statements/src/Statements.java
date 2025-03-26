//it is an interface.
//We don't create the obj we create the obj of the
//statement using connection. we handle it using references.
//        Statement = createstatement(); //obj of statement we are creating here.

//        stm.executeQuery(select * from students);
//        stm.executeuppdate("DML: ");

//Three types of statements:

//Statement
//PreparedStatement:
//How to create prep statement();
//Prep statement execute multiple times by changing thr parameter.


//Callable statement: used fot invoking a stored procedures.
//In some databases they support some program along with a database.


import java.sql.*;
import java.util.Scanner;

public class Statements {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        //Invoke drivers

        //Connection is Establish.
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");
        System.out.println("✅ Connection Established!");

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

//       / 7. Check if any records were found
//        boolean recordFound = false;

//        // 8. If no records were found, print a message
//        if (!recordFound) {
//            System.out.println("❌ No records found for deptno = " + dno);
//        }

        pstm.close(); //close the statement.
        pstm.close(); //Connection close.
        System.out.println("✅ Connection Closed.");
    }
}