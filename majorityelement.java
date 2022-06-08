import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int candidate=arr[0];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(cnt==0) 
            {
                candidate=arr[i];
                cnt=1;
            }
            else if(candidate==arr[i]) cnt++;
            else cnt--;
        }
        cnt=0;
        for(int i=0;i<n;i++)
        {
            if(candidate==arr[i]) cnt++;
        }
        if(cnt>n/2) return candidate;
        else return -1;
	}
}
