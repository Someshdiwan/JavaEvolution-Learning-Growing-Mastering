enum Department {
    CS("John","Block A"),
    IT("Smith","Block B"),
    ECE("Dave","Block D"),
    CIVIL("Srinivas","Block C");

    String head;
    String location;

    private Department(String head,String loc) {
        this.head=head;
        this.location=loc;
    }

    public String getHeadName() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}

public class EnumDemo1 {
    public static void main(String[] args) {
        Department d=Department.CIVIL;

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }
}
