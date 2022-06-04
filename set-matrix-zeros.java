import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int a[][]) {
        // Write your code here..
        boolean[] row=new boolean[a.length];
        boolean[] col=new boolean[a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(row[i] || col[j])
                a[i][j]=0;
            }
        }
    }

}
