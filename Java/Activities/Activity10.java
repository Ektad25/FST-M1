package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        hs.add("six");
        System.out.println("The Size of Hashset is " +hs.size());
        System.out.println("Remove three from hashset: " +hs.remove("three"));
        System.out.println("Again Remove three from hashset: " +hs.remove("three"));
        System.out.println("Check three is in hashset: " +hs.contains("three"));
        for (String word : hs) {
            System.out.println(word);
        }
    }
}
