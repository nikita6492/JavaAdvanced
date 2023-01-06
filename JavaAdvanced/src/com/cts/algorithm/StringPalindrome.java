package com.cts.algorithm;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		//Dynamic Programming
		System.out.println("Enter a string to check if it is a palindrome");
		Scanner sc =new Scanner(System.in);
		String str =sc.next();
		
		int i=0, j=str.length()-1;
		boolean flag=false;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag=true;
				break;
			}
			i++;
			j--;
		}
		if(flag) {
			System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
		sc.close();
	}

}
