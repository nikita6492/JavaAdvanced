package com.cts.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondMaxAndMinNumber {

	public static void main(String[] args) {

		// Here we are using backtracking and dynamic programming approach
		//backtracking- considering edge case-if we have duplicate elements
		//dynamic programming - comparing element with the largest/smallest element 
		
		List<Integer> list = Arrays.asList(10, 12, 1, 5, 3, 11);
		List<Integer> maxList = new ArrayList<Integer>();
		List<Integer> minList = new ArrayList<Integer>();
		Collections.sort(list);

		for (int i = list.size() - 2; i > 0; i--) {

			if (list.get(i) != list.get(list.size() - 1)) {
				maxList.add(list.get(i));
				break;
			}
		}

		System.out.println("The second largest element::" + maxList);

		for (int i = 1; i <list.size(); i++) {

			if (list.get(i) != list.get(0)) {
				minList.add(list.get(i));
				break;
			}
		}
		
		System.out.println("The second smallest element::" + minList);
	}

}
