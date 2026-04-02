public class ForLoop_String_Reverse{
    public static void main(String []args){

          String name = "Tamil";

                int length = name.length();

                String reverse = " ";

                for(int i = length-1;i>=0;i--)                              //Time complexity O(n)
                    
                {

                    reverse = reverse+name.charAt(i);                   

                }

                    System.out.print(reverse);





    }
}