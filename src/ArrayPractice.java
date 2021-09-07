import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // Create and initialize an array with the following values in a single line
        // 1, 1, 2, 3, 5, 8
        int[] nums = {1, 1, 2, 3, 5, 8};

        // Loop through the array and print out each value
        // then modify the loop to only print odd numbers
        for (int i : nums) {

            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat them " +
                "with a mouse.";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        String[] sentences = str.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
