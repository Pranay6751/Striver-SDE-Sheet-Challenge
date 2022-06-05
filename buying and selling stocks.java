import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> p){
        // Write your code here.
        int maxi=0;
        int sum=p.get(0);
        for(int i=1;i<p.size();i++)
        {

            maxi=Math.max(maxi,p.get(i)-sum);
                        sum=Math.min(sum,p.get(i));
        }
        
        return maxi;
    }
}
