import java.util.*;
public class demo{
    public static void merge(int[]arr1,int[]arr2){

                    int i = 0;
                    int j = 0;
                
            ArrayList<Integer> result = new ArrayList<>();

            while(i<arr1.length && j<arr2.length){
                if(arr1[i] < arr2[j]){
                        if(result.size()==0 || result.get(result.size()-1) != arr1[i]){
                            result.add(arr1[i]);
                        }
                        i++;
                }

                else if(arr1[i]>arr2[j]){
                    if(result.size()==0 || result.get(result.size()-1) != arr2[j]){
                        result.add(arr2[j]);
                    }
                    j++;
                }

                else {
                        if(result.size()==0 || result.get(result.size()-1) != arr1[i]){
                            result.add(arr1[i]);
                        }
                        i++;
                        j++;


                }
            }



    }








}