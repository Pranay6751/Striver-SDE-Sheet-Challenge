import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        return power(x,n,m);
    }
    public static int power(int a,int b,int m1)
    {
        if(b==0) return 1;
        long x=a,n=b,m=m1;
        long ans=1;
        
        while(n>0)
        {
            if((n&1)==1) ans=(ans*x)%m;
            n>>=1;
            x=(x*x)%m;
        }
        return (int)ans;
    }
}
