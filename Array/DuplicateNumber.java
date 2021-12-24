/*
Find the Duplicate Number
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
*/
public class DuplicateNumber{
  /* Method: 1*/
  /*
  In this method we'll use the property that every number in the array is in the range of [1,n] and we can use them as potential indexes.
  We will go to each indexes from the array values and make them negative and if we encounter any number which is already negative that means we are visiting it twice which could only possible the index we are using is repeated*/
  public static int duplicateNumber(int[] arr){
    for(int num: arr){
      int index = Math.abs(num) - 1; // Since values are between [1,n] so to cover index 0 as well we need to subtract one.
      if(arr[index]<0) return index + 1;
      arr[index] = - arr[index];
    }
    return -1;
  }

  /* Method:2 */
  /* Using XOR gate, since a^a = 0 then any number which is repated the XOR will 
  become zero at that number when we travesre */
  public static int duplicateNumber2(int[] arr){
    int res = arr[0];
    for(int i = 1;i<arr.length;i++){
      res = res^arr[i];
      if(res == 0) return arr[i];
    }
    return -1;
  }
}