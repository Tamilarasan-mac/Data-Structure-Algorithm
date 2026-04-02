public class demo {
    public static void main(String[]args){

            int[] arr = {100,100,80,80,90,90,70,70};

                    int j = 0;
                
            for (int i = 1;i<arr.length;i++){
                if(arr[i]!=arr[j]){
                    j++;
                    arr[j] = arr[i];
                }
            }
            System.out.println(j+1);

    }
}
