import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> a, int n) {
        // Write your code here
//         int n=a.length;
        int res=0;
        for(int i=0;i<a.size();i++)
        {
            res^=a.get(i);
        }
        for(int i=1;i<=n;i++)
        {
            res^=i;
        }

        int res1=0,res2=0;
        int lm=(res&(~(res-1)));
        for(int i=0;i<a.size();i++)
        {
            if((a.get(i)&(lm))!=0) res1^=a.get(i);
            else res2^=a.get(i);
        }
        for(int i=1;i<=n;i++)
        {
            if((i&(lm))!=0) res1^=i;
            else res2^=i;
        }
        int[] k=new int[2];
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)==res1)
            {
                k[0]=res2;  k[1]=res1;
                break;
            }
            if(a.get(i)==res2)
            {
                k[0]=res1; k[1]=res2;
                break;
            }
        }
        
        
        return k;
    }
}
