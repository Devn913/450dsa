/*
Move all negative numbers to beginning and positive to end with constant extra space. (Order is not important here)
*/
public class MoveNegatives{
  /* For this we'll use 2 pointer solution, one pointer at start and one at the end and we will swap whenever any positive number is at starting and negative at the end and decrease last pointer and increment first pointer*/
  public static void moveNegatives(int[] arr){
    int start = 0;
    int last = arr.length -1;
    while(start<last){
      if(arr[start]<0){
        start++;
      }else{
        if(arr[last]<0){
          swap(arr,start,last);
          start++;
        }
        last--;
      }
    }
  }
  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}