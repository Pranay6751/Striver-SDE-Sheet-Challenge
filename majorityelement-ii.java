import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> nums) 
    {
        // Write your code here.
                int num1=Integer.MIN_VALUE;
        int num2=Integer.MIN_VALUE;
        int c1=0,c2=0;
        for(int i=0;i<nums.size();i++)
        {
            if(num1==nums.get(i)) c1++;
            else if(num2==nums.get(i)) c2++;
            else if(c1==0)
            {
                num1=nums.get(i);
                c1=1;
            }
            else if(c2==0)
            {
                num2=nums.get(i);
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        ArrayList<Integer>ll=new ArrayList();
        c1=0;c2=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)==num1) c1++;
            if(nums.get(i)==num2) c2++;
        }
        if(c1>(nums.size()/3)) ll.add(num1);
        if(c2>(nums.size()/3)) ll.add(num2);
        return ll;
    }
}
