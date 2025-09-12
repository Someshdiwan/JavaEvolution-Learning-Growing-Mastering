package Devices;

public class Test extends SmartPhone {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.CloseCamera();
        smartPhone.endCall();
        smartPhone.stopMusic();
        smartPhone.playMusic();
    }
}

/* The difference between abstract class and interface is,
Abstract class mai instance variable hote hai and unko initialize karne ko constructor hota hai.
one class can only extend one abstract class.
But in interface this is not and in interface. Interface can implement multiple or Extends multiple class.
*/
