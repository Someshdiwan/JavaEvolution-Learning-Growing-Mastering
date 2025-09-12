package Devices;

//Multiple Interface in JAVA

public class SmartPhone implements Camera, MusicPlayer, Phone {
    @Override
    public void OpenCamera() {
        System.out.println("Hello Open Camera");
    }

    @Override
    public void CloseCamera() {
        System.out.println("Hello Open Camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Hello Open Camera");
    }

    @Override
    public void stopMusic() {
        System.out.println("Hello Open Music");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Hello Open Camera");
    }

    @Override
    public void endCall() {
        System.out.println("Hello Open Call");
    }
}
