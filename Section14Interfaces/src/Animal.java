//Abstract Method
//Static Constant

interface Animal {
        public static int MAX_AGE = 100;

        public abstract void eat();

        void sleep();

        //static methods.
        public static void info() {
            System.out.println("THis is an animal interface");
        }
}

class Dog implements Animal {
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void sleep(){
        System.out.println("nothing just sleeping");
    }
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }

    public void sleep(){
        System.out.println("just sleeping");
    }
}

class Tetst{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

        System.out.println((Dog.MAX_AGE)); //You can access from Animal also.
        System.out.println(Animal.MAX_AGE);
    }
}
