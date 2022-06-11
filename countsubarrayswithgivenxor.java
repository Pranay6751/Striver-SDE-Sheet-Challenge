import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer,Integer>hm=new HashMap();
        hm.put(0,1);
        int pre=0;
        int ans=0;
        for(int i=0;i<arr.size();i++)
        {
            pre^=arr.get(i);
            if(hm.containsKey(x^pre)) ans+=hm.get(x^pre);
            hm.put(pre,hm.getOrDefault(pre,0)+1);
        }
        return ans;
	}
}
