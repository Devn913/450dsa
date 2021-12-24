/*
Maximum and minimum of an array using minimum number of comparisons
*/
public class MinMax{
  public static void minMax(int[] arr){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    if(arr.length==1){
      min = max = arr[0];
    }else{
      for(int num: arr){
        if(num>max) {
          max = num;
          continue;
          }
        if(num<min) min = num;
      }
    }
    System.out.println("Min : "+ min);
    System.out.println("Max: " + max); 
  }
}