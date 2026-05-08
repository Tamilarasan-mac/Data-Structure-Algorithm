public class String_Reverse {
    public static void main(String[] args) throws Exception {

        String name = "Tamil";       
        int n = name.length()-1;
        String reverse = " ";           // To add the i in reverse variable

        for(int i = n;i>=0;i--){

                reverse = reverse + name.charAt(i);     //" "+"l" = l , "l" + "i"=li , "li"+"m"=lim , "lim"+"a"=lima , "lima"+"T"=limaT
        }
            System.out.println(reverse);
    }
}
