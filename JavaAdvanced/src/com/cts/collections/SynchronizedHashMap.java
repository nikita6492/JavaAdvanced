package com.cts.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SynchronizedHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	    hashmap.put(1, "A");
	    hashmap.put(2, "B");
	    hashmap.put(3, "C");
	    hashmap.put(4, "D");
	    hashmap.put(5, "E");
	    Map<Integer, String> map= Collections.synchronizedMap(hashmap);
	    Set<Entry<Integer, String>> set = map.entrySet();
	    synchronized(map){
	        Iterator<Entry<Integer, String>> i = set.iterator();
	        while(i.hasNext()) {
	            Map.Entry<Integer, String> pair = (Map.Entry<Integer, String>)i.next();
	            System.out.print(pair.getKey() + ": ");
	            System.out.println(pair.getValue());
	        }
	    }

	}

}
