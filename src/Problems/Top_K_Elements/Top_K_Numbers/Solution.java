package Problems.Top_K_Elements.Top_K_Numbers;
import java.util.*;

/*** Given an integer array nums and an integer k, 
 * return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * You must solve it in O(n) time complexity   */

 public class Solution {
   public List<Integer> findKLargestNumbers(int[] nums, int k) {

      // create min heap. Note comparotor, which returns -1, 0, 1 to say if incoming number n1 has 
      // less priority, equal priority, or higher priority than comparable heap number n2. Lower priority would place it higher on the heap (ie top number is least priority)
      // therefore the comparator indicates that when incoming n1 is greater, that it has higher priority (is greater in magnitude) and should be placed lower.
      PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

      // loop through nums until 'k' numbers have been added to min heap
      for (int i=0; i<k; i++){
         minHeap.add(nums[i]);
      }

      // 
      return new ArrayList<>(minHeap);
   }  

}
