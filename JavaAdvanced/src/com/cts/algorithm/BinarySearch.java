package com.cts.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Divide and conquer algorithm

		List<Integer> list = Arrays.asList(10,2,4,1,0,22,34);
		System.out.println("List Elements::" +list);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter element to be searched::");
		int key =sc.nextInt();
		int first =0;
		int last =list.size();
		int mid = (first+last)/2;
		
		while(first<=last) {
			if(list.get(mid)<key) {
				first=mid+1;
			}else if(list.get(mid)==key) {
				System.out.println("Element found at ::"+mid);
				break;
			}else {
				last =mid-1;
			}
			mid = (first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not found");
		}
		sc.close();
	}

}
