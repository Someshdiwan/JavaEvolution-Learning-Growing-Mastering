package ZOO;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name, "Bark");
    }

    public void wagTail(){
        System.out.println(getName()+"is wagging its tail.");
    }

    public String getName(){
        return getClass().getSimpleName();
        //Class ka name provide karta hai getSimpleName
    }

    public void setDogSound(String newSound){
        changeSound(newSound);
    }
}