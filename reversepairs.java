import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int[] a=new int[arr.size()];
        for(int i=0;i<arr.size();i++) a[i]=arr.get(i);
        return reverse(a);
    }
    public static int reverse(int[] nums) {
        return merge(0,nums.length-1,nums);
    }
    public static int merge(int l,int h,int[] arr)
    {
        int ans=0;
        if(l<h)
        {
        int m=(l+h)/2;
        ans=merge(l,m,arr);
        ans+=merge(m+1,h,arr);
        ans+=mergefun(l,m,h,arr);
        }
        return ans;
    }
    public static int ceil(int[] a,long x)
    {
        long ans=-1;
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if((long)a[m]<=x) l=m+1;
            else
            {
                ans=m;
                h=m-1;
            }
        }
        return (int)ans;
    }
    public static int mergefun(int l,int m,int h,int[] arr)
    {
        int ans=0;
        int n1=m-l+1,n2=h-m;
        int[] a=new int[n1];
//         int l1,l2=0;
        for(int i=0;i<n1;i++) a[i]=arr[l+i];
        
        int[] b=new int[n2];
        for(int i=0;i<n2;i++) b[i]=arr[m+1+i];
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            // if(a[i]==b[j] && a[i]<0 && b[j]<0)
            if(a[i]<b[j])
            {
                // System.out.println(a[i]+" "+b[j]);
                arr[k++]=a[i++];
            }
            else
            {
                int kk=ceil(a,2L*(long)b[j]);
                if(kk!=-1)
                {
                    // System.out.println("lakjfd");
                    ans+=(n1-kk);
                }
                arr[k++]=b[j++];
            }
        }
        while(i<n1){ arr[k++]=a[i++]; }
        while(j<n2){ arr[k++]=b[j++]; }
        return ans;
    }
}
