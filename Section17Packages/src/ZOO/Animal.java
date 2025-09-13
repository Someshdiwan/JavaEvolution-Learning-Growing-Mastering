package ZOO;

public class Animal {
    private String name;
    protected String sound;

    public Animal(String name, String Sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " Make a sound: " + sound);
    }

    protected void changeSound(String newSound) {
        this.sound = newSound;
    }
}
