package Problems.Two_Pointers.Min_subarray_sum;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RUNNING");
        int[] myNum = {1,2,3,4,5};
        Solution solution = new Solution();
        System.out.println("SOLUTION:" + solution.minSubArrayLen(11, myNum));
    }
}
