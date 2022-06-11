import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        HashMap<Integer,Integer>hm=new HashMap();
        hm.put(0,-1);
        int pre=0;
        int ans=0,x=0;
        for(int i=0;i<arr.size();i++)
        {
            pre+=arr.get(i);
            if(hm.containsKey(pre-x)) ans=Math.max(ans,i-hm.get(pre-x));
            if(!hm.containsKey(pre)) hm.put(pre,i);
        }
        return ans;
	}
}
