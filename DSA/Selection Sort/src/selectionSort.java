public class selectionSort{
    public static void main(String []args){

                int[] arr = {333,82,10,2,18,45};

                int n = arr.length;

                for(int i = 0; i<n ;i++){

                        int temporary = i;

                        for(int j = i+1; j<n ;j++){
                                if(arr[j]<arr[temporary]){

                                    temporary = j;

                                }
                            }

                                    int temp = arr[temporary];
                                    arr[temporary] = arr[i];
                                    arr[i] = temp;
                                

                        }
                        System.out.print("Selection Sorted Array : ");

                        for(int num : arr){
                            System.out.print(num + " ");

                        }

                     }

                }