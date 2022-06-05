import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long maxsum=arr[0];
        long cur=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            cur=Math.max(arr[i],cur+arr[i]);
            maxsum=Math.max(maxsum,cur);
        }
        return Math.max(maxsum,0);
	}

}
