import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		//write your code here
        HashMap<Character,Integer>hm=new HashMap<>();
        int c=0,l=0,m=0,i=0;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                m=Math.max(m,i-l);
                int ind=hm.get(ch);
                if(ind>=l)
                l=ind+1;
                
                hm.put(ch,i);
            }
            else
            {
                hm.put(ch,i);
                
            }
        }
        // System.out.println(i+"  "+l);
         m=Math.max(m,i-l);
        return m;
	}
}
