/*

  * Kth smallest element 

  * Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

*/
import java.util.*;

public class KthSmallestElement{
  /* For this question, we'll use max prirority queue and to save space whenever queue size reach k+1 we'll pop the element so that the space complexity becomes  O(k) */
  public static int kthSmallesElement(int[] arr, int k){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int num: arr){
      pq.add(num);
      if(pq.size()==k+1) pq.remove();
    }
    return pq.peek();
  }
}