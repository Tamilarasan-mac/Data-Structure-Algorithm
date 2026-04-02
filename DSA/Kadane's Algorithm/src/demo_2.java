public class demo_2 {

        public static int maxSubArray(int[] arr){

                int curSum = 0;                         //Take CurrentSum = 0
                int maxSum = Integer.MIN_VALUE;         //Take MaximumSum = - infinity      

                for(int i = 0;i<arr.length;i++){            
                                                            
                    int temp = curSum + arr[i];                
                    if(temp < arr[i]){
                        curSum = arr[i];                            
                    }
                    else{
                                curSum = temp;
                    }

                    if(maxSum<curSum){
                        maxSum = curSum;
                    }

                }
                    return maxSum;
       }

    public static void main(String[] args) throws Exception {
       
                    int[] arr = {-1,1,-2,2,-3,3};

                    System.out.println("Maxmimum Sub Array : " + maxSubArray(arr));



    }
}           
