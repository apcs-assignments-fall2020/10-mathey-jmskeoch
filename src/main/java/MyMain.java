import java.util.Random;

public class MyMain {

    public static void main(String[] args) {
       int[] values = threeNum();
       int largest, smallest;
       System.out.println("Your three values are " + values[0] + ", " + values[1] + ", and " + values[2]); 
       largest = largest(values);
       smallest = smallest(values);
       System.out.println("The smallest value is " + smallest);
       System.out.println("The largest value is " + largest);
    }

    public static int[] threeNum() {
        int[] nums = new int[3];
        nums[0] = (int) (Math.random() * 11) + 10;
        nums[1] = (int) (Math.random() * 11) + 10;
        nums[2] = (int) (Math.random() * 11) + 10;
        return nums;
    }

    public static int largest(int[] values) {
        int largest = (values[0] >= values[1] && values[0] >= values[2]) ? values[0] : (values[1] >= values[0] && values[1] >= values[2]) ? values[1] : values[2];
        return largest;
    }

    public static int smallest(int[] values) {
        int smallest = (values[0] <= values[1] && values[0] <= values[2]) ? values[0] : (values[1] <= values[0] && values[1] <= values[2]) ? values[1] : values[2];
        return smallest;
    }


}


