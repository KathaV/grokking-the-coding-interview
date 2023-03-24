package Problems.Min_subarray_sum;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RUNNING");
        int[] myNum = {2,3,1,2,4,3};
        Solution solution = new Solution();
        System.out.println("SOLUTION:" + solution.minSubArrayLen(7, myNum));
    }
}
