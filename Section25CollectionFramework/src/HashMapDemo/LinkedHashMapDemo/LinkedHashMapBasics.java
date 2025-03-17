package HashMapDemo.LinkedHashMapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapBasics {
    public static void main(String[] args) {
        /*LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>(5);*/

        LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>(5,.75F,true);
        //true = means order of their access . 1st key show most recently used key.
        //You can change the loading factor. 0.75...

        LHM.put(1,"Hello");
        LHM.put(2,"Bye");
        LHM.put(3,"See You");
        LHM.put(4,"Gotham City");
        LHM.put(5,"The Dark Night Rises");
        LHM.put(6,"I am the BatMan");
        LHM.put(7,"Just Grind Hard Everyday and night");

        //Take String references for value.
        String s = LHM.get(2);
        String s1 = LHM.get(5);
        String s2= LHM.get(1);
        //Keys ko access kar Rahe hai and Most recently access key and Most recently accessed key.
        //Most recently accessed at the last and least recently accessed at the start.

        LHM.forEach((k,v)->System.out.println(k+" "+v));
    }
}
/*
Suppose you want to limit the size of the Linked-Hash Map then you need to override the method inside Class
and anonymous class
must be...protected boolean ....*/