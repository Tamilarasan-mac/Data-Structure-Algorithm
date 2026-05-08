public class Modifying_Elements {
    public static void main(String []args){

            int[] arr = {25,75,975,9975};                   //This Modifying method for + - * % 
            int n = arr.length;

                System.out.print("Modified Elements : ");

                for(int i =0;i<n;i++){
                    arr[i] = arr[i] + 25;
                }
                   
                for(int i = 0;i<n;i++){
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
    }
}
