package activities;

public class Activity8 {
    public static void main(String args[]) {
        try{
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
        } catch (CustomException e){
            System.out.println("The excption is: " +e.getMessage());
        }
    }
    static void exceptionTest(String msg) throws CustomException {
        if(msg == null) {
            throw new CustomException("String is null");
        }
        else {
            System.out.println("The String is: " +msg);
        }
    }
}
