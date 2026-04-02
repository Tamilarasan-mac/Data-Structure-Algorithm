public class Array_Rev_2 {
    public static void main(String[]args){

        int [] arr={1,2,3,4,5,6,7,8,9,10};

                    int left = 0;
                    int right = arr.length-1;
                    System.out.println("Before Reversing : ");

                    for(int i=0;i<arr.length;i++)
                    {
                        System.out.print( arr[i]+" ");
                    }

                while(left<right)
                {
                    int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;

                            left++;
                            right--;
            
                }
                     
                 System.out.println("After Reversing : ");
                 
                    for(int i = 0;i<arr.length;i++)
                       
                    {
                        System.out.print( arr[i]+ " ");
                    }

    }
    
}
