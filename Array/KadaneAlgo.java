/*
 *Kadane's Algorithm:-

  Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
*/
public class KadaneAlgo{
  public int maxSum(int[] arr){
    int maxSoFar = Integer.MIN_VALUE;
    int maxEndingHere= 0;
    for(int num: arr){
      maxEndingHere+=num;
      if(maxEndingHere<num) maxEndingHere = num;
      if(maxEndingHere>maxSoFar) maxSoFar = maxEndingHere;
    }
    return maxSoFar;
  }
}