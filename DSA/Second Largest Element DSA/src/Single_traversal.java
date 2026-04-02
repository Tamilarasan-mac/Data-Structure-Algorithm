public class Single_traversal{
    public static void main(String[]args){

            int[] arr = {55,666,7777,88888};

                int firstlargest = arr[0];
                int secondlargest = Integer.MIN_VALUE;

                for(int i =1;i<arr.length;i++){             //iteration 3

                    if(arr[i]>firstlargest){                // arr[3] = 88888 > firstlargest arr[2] = 7777 ==> True
                            secondlargest = firstlargest;   // secondlargest = 7177 Assigned
                            firstlargest = arr[i];          // firstlargest = 88888 Assigned

                    }
                    else if(arr[i]>secondlargest && arr[i]!= firstlargest){
                        secondlargest = arr[i];
                    }


                }

                System.out.println("Second Largest :" + secondlargest);


    }
}