import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
//         if(n==1 || m==1) return;
//         int n=mat.size();
//         int m=mat.get(0).size();
        int left=0,right=m-1;
        int top=0,bottom=n-1;
//         int prev=(top+1<=bottom)?mat.get(top+1).get(0):mat.get(0).get(0);
        while(top<bottom && left<right)
        {
            int prev=(top+1<=bottom)?mat.get(top+1).get(left):mat.get(top).get(left);
            for(int i=left;i<=right;i++)
            {
                int t=mat.get(top).get(i);
                mat.get(top).set(i,prev);
                prev=t;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                int t=mat.get(i).get(right);
                mat.get(i).set(right,prev);
                prev=t;
            }
            right--;
            if(top<=bottom)
            {
                 for(int i=right;i>=left;i--)
                {
                    int t=mat.get(bottom).get(i);
                    mat.get(bottom).set(i,prev);
                    prev=t;
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    int t=mat.get(i).get(left);
                    mat.get(i).set(left,prev);
                    prev=t;
                }
                left++;
            }
        }
    }
}
