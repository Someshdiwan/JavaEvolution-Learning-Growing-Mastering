class Student {
    public int rollno;
    public String name;
    public String Course;
    public int m1, m2, m3;

    //Now declares the methods .you above declares all the properties now declares behaivors means Methods.

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 70)
            return 'A';
        else if (average() > 50)
            return 'B';
        else return 'C';
    }

    public String Details() {
        return ("Roll No is : " + rollno + "\n" + "Name is " + name + "\n" + Course + "\n" + m1 + m2 + m3);
    }
}

    class StudentTest {
        public static void main(String[] args) {
            Student s = new Student();

            s.rollno=1;
            s.name="Don";
            s.Course="CSE";

            s.m1=70;
            s.m2=60;
            s.m3=50;

            s.average();

            System.out.println("Total : "+s.total());
            System.out.println("Average: "+s.average());

            System.out.println("Details:\n"+s.Details());

        }
    }