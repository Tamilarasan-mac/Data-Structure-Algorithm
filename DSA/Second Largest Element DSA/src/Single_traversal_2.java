public class Single_traversal_2 {
    public static void main(String [] args){
        int[] arr = {88000,77000,66000,55000,44000};

                int firstlargest = arr[0];
                int secondlargest = Integer.MIN_VALUE;

            for(int i = 1;i<arr.length;i++){                    // iteration 1

                if(arr[i]>firstlargest){                         // arr[1] = 77000 > arr[0] = 88000 is False

                    secondlargest = firstlargest;              
                    firstlargest = arr[i];

                }

            else if(arr[i]>secondlargest && arr[i] != firstlargest){   // arr[1] = 77000 > secondlargest = Integer.MIN_VALUE; ==> True

                secondlargest = arr[i];                                // secondlargest = arr[1] ==> 77000 Assigned

            }

            }

            System.out.println("Second Largest : " + secondlargest);


    }
    
}
