public class linearSearch {
            public static void main(String[] args){

            int[] arr = {3,6,18,9,4,2};
            
            int target = 18;

            int result = find(arr, target);

                System.out.print("Element found at index :"  + result);


        }

        public static int find (int[] arr, int target){
        
            for(int i = 0;i < arr.length; i++){

                if(arr[i] == target){
                    return i;
                }
            }
                return -1;

    }



}