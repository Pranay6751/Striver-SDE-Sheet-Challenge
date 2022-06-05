import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] a)
    {
        //Write your code here
        int i=0,j=0,k=a.length-1;
        while(j<=k)
        {
            if(a[j]==0)
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;j++;
            }
            else if(a[j]==1) j++;
            else
            {
                int t=a[k];
                a[k]=a[j];
                a[j]=t;
                k--;
            }
        }
//         return a;
    }
}
