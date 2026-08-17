public class BobbleSortOptimized {
    public static void main(String[] args){

            int[] arr = {13,32,26,35,10};

            int n = arr.length;

            boolean swapped;

            for(int i = 0; i<n-1; i++){

                swapped = false;

                for(int j = 0;j<n-i-1; j++){

                    if(arr[j] > arr[j+1]){

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                            swapped = true;

                    }
                }

                    if(!swapped){
                        break;
                    }

            }

            System.out.println("Bobble Sort Optimized : ");

            for(int num : arr){
                System.out.print(num + " ");
            }
    }
}
