package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String args[]) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Ekta");
        myList.add("Toshi");
        myList.add(1,"Osheen");
        myList.add(3,"Sweety");
        myList.add(2,"Abhi");
        System.out.println("The names are: ");
        for (String name : myList ) {
            System.out.println(name);
        }
        System.out.println("The third element is: " +myList.get(2));
        System.out.println("Toshi exist in the list: " +myList.contains("Toshi"));
        System.out.println("The Size of Arraylist is " +myList.size());
        myList.remove(4);
        System.out.println("The Size of Arraylist after removal is "+myList.size());
    }
}
