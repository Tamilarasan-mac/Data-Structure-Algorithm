import java.util.Arrays;

public class Array_Sort_Second_Highest {
    public static void main(String[] args) {

        int[] arr = {10,5,20,8};

       Arrays.sort(arr);

            System.out.println("Sorted Array : "+ Arrays.toString(arr));  //{5,8,10,20}

            int secondlargest = arr.length-2;                             //array.length = 4 - 2 = 2 , So index position 2 is 10


            for(int i = 2;i<=secondlargest;i++)                           //2 <= 2 , loop runs
            {
                System.out.println("Second Largest : "+ arr[i]);          //arr[i] , that is arr{5,8,10,20}[i = 2] So, arr[2]=10
            }




        
    }
}
