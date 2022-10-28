package activities;

public class Activity12 {
    public static void main(String args[]) {
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(3, 4));
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad1.add(33, 44));
    }
}
