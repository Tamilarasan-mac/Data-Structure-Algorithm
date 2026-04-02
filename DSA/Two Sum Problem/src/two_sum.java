import java.util.*;
public class two_sum{
   public static void main(String[]args){

        int[] arr = {2,7,11,15};

            int target = 26;

            int[] result = twoSum(arr, target);

            System.out.println(result[0]+" "+result[1]);
   }

 public static int[] twoSum(int[] arr , int target) {

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i = 0;i<arr.length;i++)
            {
                int complement = target - arr[i];

                if(map.containsKey(complement)){

                    return new int[]{map.get(complement),i};

                }
                map.put(arr[i],i);
            }
                    return new int[] {};
      }




    }
