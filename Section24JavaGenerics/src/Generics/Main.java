package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1);

    }
}

/*
The above code issues solved by Generics:

No Type safety
Manual casting
No Compile Time checking
Generics can solve These issues.
*/
