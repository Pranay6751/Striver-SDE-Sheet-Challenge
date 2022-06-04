import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        //c(n,r)=((n-r+1)*c(n,r-1))/r
        
        ArrayList<ArrayList<Long>>ll=new ArrayList();
        for(int i=0;i<n;i++)
        {
            ArrayList<Long>t=new ArrayList();
            long prev=1;
            for(int j=0;j<i+1;j++)
            {
                if(j==0) t.add(prev);
                else
                {
                    long val=((i-j+1)*prev)/j;
                    t.add(val);
                    prev=val;
                }
            }
            ll.add(t);
        }
        return ll;
	}
}
