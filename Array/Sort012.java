// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order (Without using any sorting algo).
public class Sort012{
  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void sort012(int[] arr){
    int low = 0;
    int high = arr.length - 1;
    while(low<high){
      if(arr[low] == 0){
        low++;
      }
      else{
        if(arr[high] == 0){
          swap(arr,low,high);
          low++;
        }
        high--;
      }
    }
    high = arr.length-1;
    while(low<high){
      if(arr[high] == 2){
        high--;
      }else{
        if(arr[low]==2){
          swap(arr,low,high);
          high--;
        }
        low++;
      }
    }    
  }
}