public class StudentChallengeAB {
    public static void main(String[] args) {
        String str = "Programmer@Gmail.com";
        int i = str.indexOf("@");
        String uname = str.substring(0 , i);
        String domainname = str.substring(i+1, str.length());

        System.out.println("UserName : " + uname);
        System.out.println("Domain is: " + domainname);
        System.out.println(domainname.startsWith("Gmail")); //Check Valid Gmail or not.

        //Now we have to check whether this is a domain name and gmail name is valid or not
        int j =domainname.indexOf(".");
        String name = domainname.substring(0, j);
        System.out.println(name.equalsIgnoreCase("gmail"));
    }
}
