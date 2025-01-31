//You have to wtite a 2 classes one is subject and students.
//you have to write a class for subject and subjID and name and maxMarks and maxobtain. you have to decide the data type and properties methods and constructers. how many constructer are possible.
//data type Should be a string for subID and name also and MaxMarks is Int and MarksObtain is als.
//Property methods get method for all of them... what about the set method
//maxmarks can change everytime so marksobtain are also use the set method
//constructer you can not have non parameterized cons.. subject(sid, name) and subject(",",max marks, marks obtain)


class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;

    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}

    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }

    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }

    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }

    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }

}

public class ArrayOfObject
{

    public static void main(String[] args)
    {
        //Array of objects
        //Subs Reference to an object
        //Pointers or References 0, 1, 2. there are no pointers in JAVA.

        //subs[0]
        //this is how we created a ArrayOfObjects

        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);

        for(Subject s:subs)
            System.out.println(s);
    }
}