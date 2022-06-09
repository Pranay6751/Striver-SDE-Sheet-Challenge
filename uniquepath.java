import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return find(0,0,m,n,dp);
	}
    public static int find(int i,int j,int m,int n,int[][] dp)
    {
        if(i>=m || j>=n) return 0;
        if(i==m-1 || j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=find(i+1,j,m,n,dp)+find(i,j+1,m,n,dp);
    }
}
