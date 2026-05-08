public class Searching_Element{
    public static void main(String[] args){

            int[] arr = {1,2,3,4,5};

                    int target = 2;
                    boolean found = false;
                    int n = arr.length;

                    for(int i = 0;i<n;i++){
                        if(arr[i] == target){
                            found = true;
                            break;
                        }
                    }
                    if(found) {
                        System.out.println("Element Found");
                    }
                    else {
                        System.out.print("Element Not Found");
                    }


    }
}