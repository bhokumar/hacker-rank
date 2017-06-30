package org.bhoopendra.learning.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;

public class ConcurrentHashMap {

	public static void main(String[] args) {
		java.util.concurrent.ConcurrentHashMap<String, String> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
		Map<String, String> map = new HashMap<>();
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
		
	}

}
