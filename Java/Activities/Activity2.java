package activities;

public class Activity2 {
    public static void main(String[] args){
        int[] array= {10, 77, 10, 54, -11, 10};
        System.out.println("result "+ sumNum(array));
    }
    public static boolean sumNum(int[] arrays){
        int sum=0;
        for (int num: arrays) {
            if(num==10){
                sum=sum+num;
            }
        }
        if(sum==30)
            return true;
        else
            return false;
    }
}
