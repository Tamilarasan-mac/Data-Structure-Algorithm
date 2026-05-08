public class Traversal_Using_For_Loop {
        public static void main(String [] args){

                int[] arr = {1,2,3,4,5};                    //TC O(n)    SC O(1)

                int n = arr.length;

                        System.out.print("Traversal Using For Loop : ");

                    for(int i = 0;i<n;i++){
                        System.out.print(arr[i]+" ");
                    }

        }
}
