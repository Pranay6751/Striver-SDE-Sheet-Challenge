import java.util.* ;
import java.io.*; 
public class Solution {
        static class pair {
        int a,b;
        pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }

    }
  public static String fourSum(int[] a, int sum, int n) {
      // Write your code here.
      HashMap<Integer,pair>hm=new HashMap();
      for(int i=0;i<n-1;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              if(hm.containsKey(sum-(a[i]+a[j])))
              {
                  pair k=hm.get(sum-(a[i]+a[j]));
                  if(k.a!=i && k.b!=j && k.a!=j && k.b!=i) return "Yes";
              }
              hm.put(a[i]+a[j],new pair(i,j));
          }
      }
      return "No";
      
  }
}
