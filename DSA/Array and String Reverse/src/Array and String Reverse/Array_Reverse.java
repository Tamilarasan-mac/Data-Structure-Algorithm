public class Array_Reverse{
    public static void main(String[]args){

                int[] arr={1,2,3,4,5};

                    int left = 0;                       // left = 0;
                    int right = arr.length-1;           // right = arr.length-1 , that is arr.length = total elements =5
                                                        // arr.length 5-1 = 4
                    while(left<right)
                    { 
                        int temp = arr[left];           // create the temporary variable for arr[0]={1}
                        arr[left] = arr[right];         // replace arr[0] = {1}to arr[4] = {5} swap to
                        arr[right] = temp;              // then arr[4] = {5} to arr[0] = {1}

                        left++;                             //left increment value 0 to 1
                        right--;                            //right decrement value 4 to 3
                                                        //this action is runs again and again when while (left<right)
                    }

                    for(int i=0;i<arr.length;i++)
                    {
                        System.out.print(arr[i]+" ");
                    }

    }
}