package com.cts.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String temp[] = line1.split(",");
        int inputArr[] = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            inputArr[i] = Integer.parseInt(temp[i]);
        }
        int output = obj.solve_function(inputArr);
        System.out.println(String.valueOf(output));
        
       
    }
}

class Solution {
    public int solve_function(int[] scores) {
        int count=0;
        //[1,2,0,3] = 1, 1,1,1,1 -
        //[0,1,2,3]// 4
        //[1,0,2] - 1, 1, 1  1>0 -1 , 0>2-0 , 1<0 -0 , 2>0-1 = 5
        //[6,4,7,2,9] - 1,1,1,1,1 - 6>4 -1, 4>6-0, 4>7-0, 7>4-1, 7>2-1, 2>7-0, 2>9-0, 9>2-1 =9
        //conditions - atleast one medal , if score greater than previous score - add 1 medal, 
        //if score greater than next score -add 1 medal
        for(int i=0;i<scores.length;i++) {
        	count++;
        	if((i+1)<scores.length) {
        	if(scores[i]>scores[i+1]) {
        		//for comparing with next neighbor
        		count++;
        	}
        	
        	}
        	if(i>0) {
        		//for comparing with previous neighbour
        		if(scores[i-1]<scores[i]) {
        			count++;
        		}
        	}
        	
        }
        
        
        return count;
    	
    }
}

