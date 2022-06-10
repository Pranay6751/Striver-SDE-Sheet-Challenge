import java.util.* ;
import java.io.*; 
public class Solution{
    static class pair implements Comparable<pair>{
        int a,b;
        pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
        public int compareTo(pair o)
        {
            if(this.a<o.a) return -1;
            else if(this.a>o.a) return 1;
            else return this.b-o.b;
        }
    }
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        HashMap<Integer,Integer>hm=new HashMap();
        ArrayList<pair>ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(s-arr[i]))
            {
                int f1=Math.min(arr[i],s-arr[i]);
                int f2=Math.max(arr[i],s-arr[i]);
                for(int k=0;k<hm.get(s-arr[i]);k++) ll.add(new pair(f1,f2));
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        Collections.sort(ll);
        int[][] ans=new int[ll.size()][2];
        for(int i=0;i<ll.size();i++)
        {
            ans[i][0]=ll.get(i).a;ans[i][1]=ll.get(i).b;
        }
        return ans;
    }
}
