public class demo_3 {
    public static int maxSubArray(int[] arr){

                int curSum = 0;
                int maxSum =Integer.MIN_VALUE;

                    for(int i=0;i<arr.length;i++){
                            int temp = curSum+arr[i];
                            if(curSum<arr[i]){
                                curSum = arr[i];
                            }
                            else {
                                curSum = temp;
                            }

                            if(maxSum<curSum){
                                maxSum = curSum;
                            }
                    }

                    return maxSum;
                }
        public static void main(String[] args){

                    int[] arr = {-5,-4,5,2,-1,-1,-2,4};

                        System.out.println("Maxmimum Sub Array : " + maxSubArray(arr));



    }
}
