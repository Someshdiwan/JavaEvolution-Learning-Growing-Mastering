//Need Practice the same thing again.
//Solve Again Revise This.
//https://abdulbari.newzenler.com/courses/java-se/contents/5fcf6ad0df944

class TV
{
    //Added annotaion.
    public void switchON(){System.out.println("TV is Switched ON");}
    public void chnageChannel(){System.out.println("TV channel is change");}
}
class SmartTV extends TV
{
    @Override
    public void switchON(){System.out.println("smart TV is Switched On");}
    @Override
    public void chnageChannel(){System.out.println("Smart Tv Browsing");}

    public void browse(){System.out.println("Smart Tv Browsing");}
}
public class Overriding
{
    public static void main(String[] args)
    {
       SmartTV t1=new SmartTV();
       t1.switchON();
       t1.chnageChannel();
       t1.browse();

       TV t2=new SmartTV();
       t2.chnageChannel();
       t2.switchON();
       //Not allowed below
       //SmartTV st3=new TV();

       TV t=new TV();
       t.switchON();
       t.chnageChannel();
    }
}