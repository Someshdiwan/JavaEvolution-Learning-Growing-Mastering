package Devices;

public class Test extends SmartPhone
{
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.CloseCamera();
        smartPhone.endCall();
        smartPhone.stopMusic();
        smartPhone.playMusic();
    }
}
//Differnce between abstaract class and interfcae is, Abstract class mai instance vaiable hote hai and unko initialize karne ko constucter hota hai.
//one class can only extends one abstract class.
//But in interface this is not and in interface. Interface can implemnts multiple or Extends multiple class.