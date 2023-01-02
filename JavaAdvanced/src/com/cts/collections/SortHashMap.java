package com.cts.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");

		System.out.println("*****Before Sorting******");
		Set set = hashmap.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}
		// Sorting by keys
		System.out.println("*****After Sorting By Keys*****");
		Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);
		Set set2 = map.entrySet();
		Iterator itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry pair = (Map.Entry) itr2.next();
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}

		// Sorting by value
		System.out.println("*****************************************************");
		List list = new LinkedList(hashmap.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		
		HashMap hm = new LinkedHashMap();
		Iterator it =list.iterator();
		while(it.hasNext()) {
			Map.Entry entry =(Map.Entry)it.next();
			hm.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("*********After Sorting By Values***********");
		Set set3 = hm.entrySet();
		Iterator itr3 = set3.iterator();
		while (itr3.hasNext()) {
			Map.Entry pair = (Map.Entry) itr3.next();
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}
	}

}
