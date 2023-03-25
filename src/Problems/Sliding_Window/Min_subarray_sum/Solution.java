package Problems.Two_Pointers.Min_subarray_sum;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, sum = 0, tmp = 0, min = Integer.MAX_VALUE;
        System.out.println("RUNNING 2");

        // add til you reach the end,
        while (end < nums.length){
            System.out.println(start +", "+end+", "+tmp);

            // from the checkpoint of last added num to the end, add all numbers
            sum += nums[end++];
            
            System.out.println(sum);
            // if the sum is too small, move end pointer, and move checkpoint to end
            while (sum>=target){
                min = end-start;
                sum -= nums[start++];

                System.out.println(sum+", "+min);
                
            }

        }
        return min==Integer.MAX_VALUE? 0:min;
    }
}
