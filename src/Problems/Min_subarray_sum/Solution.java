package Problems.Min_subarray_sum;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, sum = 0, tmp = 0, min = nums.length+1;
        System.out.println("RUNNING 2");

        // add til you reach the end,
        while (end < nums.length){
            System.out.println(start +", "+end+", "+tmp);

            // from the checkpoint of last added num to the end, add all numbers
            for (int i=tmp;i<=end; i++){

                sum += nums[i];
                System.out.println("adding "+nums[i]+" gives "+sum);
            }
            
            // if the sum is too small, move end pointer, and move checkpoint to end
            if (sum < target){
                end += 1;

                tmp = end;
            }

            // if the sum is too big, move the start pointer
            else if (sum > target){
                sum = 0;
                start += 1;

                tmp = start;
                if (end <start){
                    end=start;
                }
            }

            else if (sum == target &&  end-start+1 < min){
                min = end-start+1;
                start += 1;
                tmp = start;
                end = start;
                sum = 0;

                System.out.println("UPDATE: "+min);
            }

        }

        if (min< nums.length+1){
            System.out.println("NON-zero:"+min);
            return min;
        }
        return 0;
    }
}
