import java.util.Date;

class StudentName {
    private String rollNo;

    private static int count=1;

    private String assignRollNo() {
        Date d = new Date();

        String rno="University-"+(d.getYear()+1900)+"-"+count++;

        return rno;
    }

    StudentName() {
        rollNo=assignRollNo();
    }

    public String getRollNo() {
        return rollNo;
    }
}

public class ToughStaticSolveIt {
    public static void main(String[] args) {
        StudentName s1=new StudentName();
        StudentName s2=new StudentName();
        StudentName s3=new StudentName();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}
