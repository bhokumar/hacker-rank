package org.bhoopendra.learning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionCliet2 {

	public static void main(String[] args) {
		List<Integer> inetgers = new ArrayList<>();
		for (int i = -3; i < 3; i++) {
			inetgers.add(i);
		}

		Iterator<Integer> iterator = inetgers.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer);
		}
		
		for(int i=0;i<3;i++){
			inetgers.remove((Integer)i);
		}
		
		System.out.println("After removal");
		for(int item : inetgers){
			System.out.println(item);
		}
	}

}
