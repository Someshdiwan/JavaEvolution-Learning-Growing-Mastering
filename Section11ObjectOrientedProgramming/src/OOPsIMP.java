//Pending solve it again

class Subject1
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject1(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}

    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    public String toString()
    {
        return "\nSubject ID:"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
    }
}

class Student1
{
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private Subject sub[];


    public Student1(String roll,String name)
    {
        this.rollNo=roll;
        this.name=name;

    }
    public Student1(String roll,String name,int ns)
    {
        this.rollNo=roll;
        this.name=name;
        this.numOfSub=ns;
    }

    public String getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public int getNoOfSubjects(){return numOfSub;}
    public Subject[] getSubjects(){return sub;}

    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubjects(Subject ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }

    public String toString()
    {
        return "Roll :" +rollNo+"\nName :"+name+"\nDept :"+dept;
    }

}

public class OOPsIMP
{

    public static void main(String[] args)
    {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);

        for(Subject s:subs)
            System.out.println(s);
    }
}