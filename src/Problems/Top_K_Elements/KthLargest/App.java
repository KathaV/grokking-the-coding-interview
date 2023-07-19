package Problems.Top_K_Elements.KthLargest;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RUNNING");
        Solution solution = new Solution();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println("SOLUTION:" + solution.findKthLargest(nums, 4));
    }
}
