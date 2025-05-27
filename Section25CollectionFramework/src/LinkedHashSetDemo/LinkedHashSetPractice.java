package LinkedHashSetDemo;

import java.util.LinkedHashSet;

class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> playlist = new LinkedHashSet<String>();
        playlist.add("Moonlight Sonata");
        playlist.add("The Godfather");
        playlist.add("Whiplash");
        playlist.add("Whiplash");

        System.out.println(playlist);
    }
}
