import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return merge(0,n-1,arr);
    }
    public static long merge(int l,int h,long[] arr)
    {
        long ans=0;
        if(l<h)
        {
        int m=(l+h)/2;
        ans=merge(l,m,arr);
        ans+=merge(m+1,h,arr);
        ans+=mergefun(l,m,h,arr);
        }
        return ans;
    }
    public static long mergefun(int l,int m,int h,long[] arr)
    {
        long ans=0;
        int n1=m-l+1,n2=h-m;
        long[] a=new long[n1];
//         int l1,l2=0;
        for(int i=0;i<n1;i++) a[i]=arr[l+i];
        
        long[] b=new long[n2];
        for(int i=0;i<n2;i++) b[i]=arr[m+1+i];
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                arr[k++]=a[i++];
            }
            else
            {
                ans+=(n1-i);
                arr[k++]=b[j++];
            }
        }
        while(i<n1){ arr[k++]=a[i++]; }
        while(j<n2){ arr[k++]=b[j++]; }
        return ans;
    }
}
