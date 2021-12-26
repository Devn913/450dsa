/*

Cyclically rotate an array by one 

Given an array, rotate the array by one position in clock-wise direction.

*/

public class RotateArray{
  public void swap(int[] arr, int i, int j){
    int temp =arr[i];
    arr[i]  = arr[j];
    arr[j] = temp;
  }
  public void rotateByOne(int[] arr){
    for(int i = arr.length-1;i>0;i--){
      swap(arr,i,i-1);
    }
  }
}