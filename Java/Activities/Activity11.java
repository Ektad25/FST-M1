package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String args[]) {
        HashMap<Integer, String> colours = new HashMap<Integer, String>();
        colours.put(1,"Red");
        colours.put(2,"Blue");
        colours.put(3,"Yellow");
        colours.put(4,"Pink");
        colours.put(5,"Green");
        System.out.println("The Hashmap contains: " +colours);
        colours.remove(3);
        System.out.println("The Hashmap After removing contains: " +colours);
        System.out.println("Green Color exist: " +colours.containsValue("Green"));
        System.out.println("Size of Hashmap: " +colours.size());
    }
}
