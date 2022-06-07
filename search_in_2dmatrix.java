import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> a, int m, int n, int target) {
		// Write your code here.
        
        int i=0,j=n-1;
        while(i<m && j>=0)
        {
            if(a.get(i).get(j)==target) return true;
            if(a.get(i).get(j)<target) i++;
            else j--;
        }
        return false;
	}
}
