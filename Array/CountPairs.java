/*
Count pairs with given sum.

Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
*/
import java.util.*;
public class CountPairs{
  /*
  We will use HashMap to count the frequency of elements and save it and then we will use linear traversal into the array one by one and for every num we will search the frequency of k-num in the hashmap and add it to counter and one special condition if n == k-num we will decrement the counter once and return half of counter since we counted pairs twice*/
  public static int countPairs(int[] arr, int k){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num: arr) map.put(num,map.getOrDefault(num,0)+1);
    int counter = 0;
    for(int num: arr){
      int target = k-num;
      counter+=map.getOrDefault(target,0);
      if(num == target) counter--;
    }
    return counter/2;
  }
}