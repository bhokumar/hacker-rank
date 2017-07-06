package org.bhoopendra.learning.collection;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CollectionClient {

	public static void main(String[] args) {
		Collection<?> collections[] = {new HashSet<>(),new LinkedList<>(),new TreeSet<>(),new LinkedHashSet<>(),new ArrayList<>(),new LinkedList<>()};
		new CollectionClient().classifyCollection(collections);
	}
	
	void classifyCollection(Collection<?> collections[]){
		for(Collection<?> collection : collections){
			System.out.println(getCollectionType(collection));
		}
	}

	private String getCollectionType(final Collection<?> c){
		return c instanceof List ? "List":c instanceof Set? "Set" :"Unknown Type";
	}
}
