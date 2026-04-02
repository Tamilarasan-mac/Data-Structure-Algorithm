public class Duplicate_array{
    public static void main (String []args){
            int[] arr = {1,1,2,2,3,4,4};

                  int j = 0;
 
            for(int i = 1;i<arr.length;i++)
            {
                if(arr[i]!=arr[j])
                    {
                        j++;
                        arr[j]= arr[i];             //a[j] = 1  
                    }
                }

                
                System.out.println(j+1);
               
    }
        
   
}