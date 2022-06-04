import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) 
    {   
        int i=nums.size()-2;
        while(i>=0 && nums.get(i)>=nums.get(i+1))
        {
            i--;
        }
        // System.out.println(i);
        if(i>=0)
        {
            for(int j=nums.size()-1;j>i;)
            {
                // System.out.println("j "+j+" "+nums[i]+" jh "+nums[j]);
                if(nums.get(j)>nums.get(i))
                {
                    int t=nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,t);
                    // System.out.println(nums[i]+" jh "+nums[j]);
                    break;
                }
                else j--;
            }
        }
        reverse(nums,i+1,nums.size()-1);  
        return nums;
    }
    public static void reverse(ArrayList<Integer> nums,int l,int h)
    {
        while(l<h)
        {
            int t=nums.get(l);
            nums.set(l,nums.get(h));
            nums.set(h,t);
            l++;
            h--;
        }
    }
}
