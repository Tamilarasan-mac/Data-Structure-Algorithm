
public class demo_2 {
    public static void main(String[] args){

            int[] arr = {3,1,4,1,5,9};

                    int n = arr.length;

                int[] prefix = new int[n];

                prefix[0] = arr[0];

                for(int i =1;i<n;i++){
                    prefix[i] = prefix[i-1]+arr[i];
                }

                        System.out.print("Prefix Sum : ");

                    for(int i = 0;i<n;i++){
                        System.out.print( prefix[i] + " ");
                    }


    }
}
