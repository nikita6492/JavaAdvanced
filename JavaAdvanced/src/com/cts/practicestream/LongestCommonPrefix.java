package com.cts.practicestream;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		//longest common prefix
		List<String> strList =new ArrayList<String>();
		strList.add("flower");
		strList.add("flight");
		strList.add("flow");
		
		String prefix =strList.get(0);
		
		for(int i=1;i<strList.size();i++) {
			while(!strList.get(i).startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		if(prefix.isEmpty()) {
			System.out.println("No common prefix");
		}
		else {
			System.out.println(prefix);
		}
		
		//longest common suffix
		
		List<String> strList1 =new ArrayList<String>();
		strList1.add("flower");
		strList1.add("tower");
		strList1.add("shower");
		
		String suffix =strList1.get(0);
		//int x=0;
		for(int i=1;i<strList1.size();i++) {
			while(!strList1.get(i).endsWith(suffix)) {
				suffix = suffix.substring(1);
				//System.out.println(suffix);
				//x++;
			}
		}
		if(suffix.isEmpty()) {
			System.out.println("No common suffix");
		}
		else {
			System.out.println(suffix);
		}
	}

}
