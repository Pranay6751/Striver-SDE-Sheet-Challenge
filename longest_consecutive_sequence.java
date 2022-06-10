import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] nums, int N) {
        // Write your code here.
        if(nums.length==0) return 0;
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums)
        {
            h.add(i);   
        }
        int n=nums.length;
        int maxi=-1;
        for(int i=0;i<n;i++)
        {
            
            if(!h.contains(nums[i]-1)){
                int c=1,k=nums[i];
                while(h.contains(k+1)){ c++; k++;}
                maxi=Math.max(maxi,c);
            }
        }
        return maxi;
    }
}
