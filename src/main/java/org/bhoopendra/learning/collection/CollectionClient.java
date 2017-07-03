package org.bhoopendra.learning.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClient {

	public static void main(String[] args) {
		Collection<?> collections[] = {new HashSet<>(),};
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
