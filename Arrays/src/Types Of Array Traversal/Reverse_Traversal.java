public class Reverse_Traversal {
    public static void main (String[]args){

                int[] arr = {10,20,30,40,50};     
                int n = arr.length;                                      //TC O(n)       SC O(1)

                System.out.print("Reverse Traversal : ");

                for(int i = n-1;i>=0;i--){
                    System.out.print(arr[i]+ " ");
                }


    }
    
}
