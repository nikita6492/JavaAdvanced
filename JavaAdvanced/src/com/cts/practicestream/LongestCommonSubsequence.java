package com.cts.practicestream;

import java.util.Arrays;
import java.util.List;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ABCDEH";
		String str2 = "ADEHR";
		
		int m=str1.length();
		int n=str2.length();
		int dp[][]=new int[m+1][n+1];
		
		for(int i=1;i<=m;i++) {
			for(int j=1; j<=n;j++) {
				
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		int len =dp[m][n];
		char lcs[]=new char[len];
		int i=m, j=n, k=len-1; 
		while(i>0 && j>0) {
			if(str1.charAt(i-1) == str2.charAt(j-1)) {
				lcs[k--]=str1.charAt(i-1);
				i--;
				j--;
			}else if(dp[i-1][j]>dp[i][j-1]) {
				i--;
			}else {
				j--;
			}
		}
		System.out.println(new String(lcs));
	}

}
