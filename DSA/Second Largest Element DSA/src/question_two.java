import java.util.Arrays;

public class question_two {
    public static void main(String[] args) throws Exception {
        
            int[] number = {10,5,20,8};                         
                                                                           //Array.length            1  2   3   4
            Arrays.sort(number);                                                    //Sorted Array :[5, 8, 10, 20]
                                                                            //index n()  =           0  1   2   3
            System.out.println("Sorted Array :" + Arrays.toString(number));        

            System.out.println("Second Largest element :" + number[number.length-2]);       //number[4-2] = 2 //number [2] = 2nd position of index
                                                                                                    



    }
}
