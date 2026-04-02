import java.util.*;

public class Merge_two{

    public static void merge(int[] arr1 , int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        for(int i = 0; i < n; i++) {

            if(arr1[i] > arr2[0]) {

                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                Arrays.sort(arr2);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        merge(arr1 , arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}