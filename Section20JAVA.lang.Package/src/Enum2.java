enum Status
{
    Running, failed, Pending, Success;
}

public class Enum2 {
    public static void main(String[] args) {
        int i =5;
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status s1= Status.Success;
        System.out.println(s1);
        System.out.println(s1.ordinal());

        Status s2 = Status.Pending;

        if(s2 == Status.Running)
            System.out.println("ALL Good");
        else if(s2==Status.failed)
            System.out.println("Try Again");
        else if(s2==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

        Status s3=Status.Success;
        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;

            case failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }
}