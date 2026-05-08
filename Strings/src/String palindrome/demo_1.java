public class demo_1{
    public static void main(String []args){

            String name = "tenet";          // This word is polindrome.
            int n = name.length()-1;
            String reverse = "";            // Don't Add space for polindrome , To add the i in reverse variable
                                            // Initialized reverse with a space " ", not an empty string.
            
            for(int i = n;i>=0;i--){

            reverse = reverse + name.charAt(i); //""+"t" = t , "t" + "e"=te , "te"+"n"=ten , "ten"+"e"=tene , "tene"+"t"=tenet

            }

            System.err.println(reverse);

                if(name.equals(reverse)){
                    System.out.println("Palindrome"); // A palindrome string is a string that reads the same forward and backward.
                }                                       // Compare characters from start and end.
                else{
                    System.out.println("Not Palindrome"); // Or not polindrome.
                }
    }
}