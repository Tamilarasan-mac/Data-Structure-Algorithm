
public class Sliding_windows_2 {
    public static void main (String[] args){

            int[] arr = {2,3,4,8,6,4};
            int k = 3;
            int result = maxSum(arr,k);

            System.out.print("Sliding Window maxSum : " + result);


    }

    public static int maxSum(int[] arr,int k){

            int windowSum = 0;
            int maxSum = 0;
            int n = arr.length;

            // First Window

            for(int i = 0;i<k;i++){         // 0 to k , k = 3
                windowSum += arr[i];        //Now windowSum add the first window , 2+3+4=9, so, Now windowSum = 9
            }
            
             maxSum = windowSum;            //that is maxSum = 9 assigned

            // Sliding Window

                for (int i = k;i<n;i++){                    // k to n , k = 3  
                    windowSum += arr[i] - arr[i-k];         //Now windowSum find the maxSum with sliding window loop
                    maxSum = Math.max(maxSum,windowSum);    // Finding the MAXIMUM of maxSum and windowSum
            }

            return maxSum;

    }
         


}
