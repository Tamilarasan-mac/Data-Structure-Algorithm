public class Sliding_windows {
    public static void main(String[] args){

                int[] arr = {1,3,7,5,2,1};
                int k = 3;

                int result = maxSum(arr, k);
                System.out.println("Sliding Window maxSum : " + result); 
               
             
    }

    public static int maxSum(int[] arr,int k){

                int windowSum = 0;
                int maxSum = 0;
                int n = arr.length;

            // First Window

            for(int i = 0;i<k;i++){                               // 0 to k , k = 3
                windowSum += arr[i];                              //Now windowSum add the first window  1+3+7, so, Now windowSum = 11
            }

             maxSum = windowSum;                                 //that is maxSum = 11 assigned

            // Sliding window

            for(int i =k;i<n;i++){                              // k to n , k = 3

                windowSum+= arr[i] - arr[i-k];                 //Now windowSum find the maxSum with sliding window loop 
                 maxSum = Math.max(maxSum, windowSum);         // Finding the MAXIMUM of maxSum and windowSum
            }

            return maxSum;
             
    }
    
}
