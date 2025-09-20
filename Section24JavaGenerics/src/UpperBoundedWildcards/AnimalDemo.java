package UpperBoundedWildcards;

import java.util.List;

class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class AnimalDemo {
    public static void makeSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        makeSound(dogs);
        makeSound(cats);
    }
}

/*
1. Classes:
   - `Animal` base class with method `sound()`.
   - `Dog` and `Cat` extend `Animal` and override `sound()` with specific behavior.

2. Upper-Bounded Wildcard:
   - Method signature: `makeSound(List<? extends Animal> animals)`
   - `? extends Animal` means:
     ✔ You can pass a `List<Dog>` or `List<Cat>` or any subclass of `Animal`.
     ✔ Read-only (safe to read as `Animal`), but you cannot safely add new elements to `animals`
       because compiler doesn’t know the exact subtype.

3. Logic:
   - For-each loop: `for (Animal animal : animals)` → safe because every element is guaranteed to be an `Animal`.
   - Calls `animal.sound()` which resolves to the overridden version (`Bark` for Dog, `Meow` for Cat).

4. Main Method:
   - `List.of(new Dog(), new Dog())` → immutable list of Dogs.
   - `List.of(new Cat(), new Cat())` → immutable list of Cats.
   - Both are passed to `makeSound()`, demonstrating polymorphism + upper-bounded wildcard flexibility.

✔ `? extends Animal` = accept a list of any subclass of Animal.
✔ Safe to read elements as `Animal`, but you cannot add new elements.
✔ Useful for covariant read-only operations.
✔ Demonstrates polymorphism: Dogs bark, Cats meow, all via one generic method.
*/
