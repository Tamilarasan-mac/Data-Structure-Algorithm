import java.util.Scanner;

public class UserInputLinearSerach {
    public static void main(String[] args){

            int[] arr = {18,7,333,10,1,45,};

            Scanner sc = new Scanner(System.in);

             while(true){

            System.err.print("Enter Element to search 🤩 :");
            int target = sc.nextInt();
            boolean found = false;
            

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == target ){
                    System.out.println("Found at index 🥳 : "+ i);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Not Found 🤧");
            }

                System.err.println("Do you want search again brow...? Say(Yezz 😉 = 1/No 😒 = 0 :) ");
                int choice = sc.nextInt();

                if(choice == 0){
                    System.out.println("Program ended 🥴");
                    break;
                }

                sc.close();
             }
    }
}
