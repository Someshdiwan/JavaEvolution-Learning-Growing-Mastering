//Solve and watch this video Again.

enum Department
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");

    String head;
    String location;

    private Department(String head,String loc)
    {
        this.head=head;
        this.location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}

public class EnumDemo1
{
    public static void main(String[] args)
    {
        Department d=Department.CS;

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }
}