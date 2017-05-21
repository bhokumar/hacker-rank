package org.bhoopendra.learning.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Client2 {
	// private static Integer count;
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("item1");
		list.add("item2");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
		}

		Map<String, String> maps = new HashMap<>();
		Set<Map.Entry<String, String>> entrySet = maps.entrySet();
		entrySet.iterator();
		
	}

}
