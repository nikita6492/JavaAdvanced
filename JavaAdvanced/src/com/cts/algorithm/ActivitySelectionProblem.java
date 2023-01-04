package com.cts.algorithm;

import java.util.Arrays;
import java.util.List;


public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// Greedy Algorithm - Prints a set of maximum activities that 
		//can be done by a single person,one at a time
		
		List<Integer> startList =Arrays.asList(0,2,5,7,1,4);
		List<Integer> finishList =Arrays.asList(3,6,7,8,10,13);
		
		int i=0, j;
		
		System.out.println("Following activities are selected");
		//First activity is always selected;
		
		System.out.print(i + " ,");
		for(j=1;j<startList.size();j++) {
			// If this activity has start time greater than or
            // equal to the finish time of previously selected
            // activity, then select it
            if (startList.get(j) >= finishList.get(i)) {
                System.out.print(j + " ,");
                i = j;
            }
		}
		

	}

}
