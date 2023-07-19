package Problems.Top_K_Elements.Top_K_Numbers;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RUNNING");
        Solution solution = new Solution();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        List<Integer> result =  solution.findKLargestNumbers(new int[] {3,1,5,12,2,11},3);
    }
}
