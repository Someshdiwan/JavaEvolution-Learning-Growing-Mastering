class phone
{
    public void call(){System.out.println("Phone call");}
    public void sms(){System.out.println("Phone sms");}
}

interface ICamera
{
    void click();
    void record();
}
interface IMusicPlayer
{
    void play();
    void stop();
}
class SmartPhone extends phone implements ICamera, IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }

    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }
}
public class InterfacesIMP {
    public static void main(String[] args)
    {
        //We can create reference of interfaces but cant crete object of it.

        IMusicPlayer M=new SmartPhone();
        M.play();
        M.stop();

        ICamera C=new SmartPhone();
        C.click();
        C.record();
    }
}