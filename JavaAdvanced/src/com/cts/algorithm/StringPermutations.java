package com.cts.algorithm;

public class StringPermutations {


	public static void permute(char[] arrA, int left, int size) {
		int x;
		if (left == size) {
			for (int i = 0; i < arrA.length; i++) {
				System.out.print(arrA[i]);
			}
			System.out.print(" ");
		} else {
			for (x = left; x < size; x++) {
				swap(arrA, left, x);
				permute(arrA, left + 1, size);
				swap(arrA, left, x);
			}
		}
	}

	public static void swap(char[] arrA, int i, int j) {
		char temp = arrA[i];
		arrA[i] = arrA[j];
		arrA[j] = temp;
	}
	public static void main(String[] args) {
		// Backtracking algorithm
		String s = "abc";
		char[] arrCh = s.toCharArray();
		permute(arrCh, 0, arrCh.length);
	}

}
