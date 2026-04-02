public class rotate_arr {
    public static void reverse(int[] arr,int start,int end) {

        while(start<end) 
        {
            int temp = arr[start];              
            arr[start] = arr[end];                      // start to end , start++
            arr[end] = temp;                             // end to start , end--
            
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr,int k){

       int n = arr.length;
       k = k % n;

       reverse(arr,0,n-1);    //whole array reverse 0 to n-1 that is 7-1=6        
       reverse(arr,0,k-1);      // 0 to k                                     
       reverse(arr,k,n-1);        // k to n-1 that is k to last


    }

    public static void main(String[] args){

    
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(arr,k);

        for (int num:arr)
        {
            System.out.print(num+" ");
        }

     }
}
