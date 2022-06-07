import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        
        int s=arr.get(0);
        int f=arr.get(0);
        do
        {
            s=arr.get(s);
            f=arr.get(arr.get(f));
        }while(s!=f);

        f=arr.get(0);
        while(s!=f)
        {
            s=arr.get(s);
            f=arr.get(f);
        }
        return s;
    }
}
