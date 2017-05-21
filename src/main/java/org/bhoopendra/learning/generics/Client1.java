package org.bhoopendra.learning.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.bhoopendra.learning.generics.beans.Animal;
import org.bhoopendra.learning.generics.beans.Lion;

public class Client1 {

	public static void main(String[] args) {
		Animal animal = new Lion();
			System.out.println(animal.getClass().getCanonicalName());
			System.out.println(animal.getClass());
			
			Set<? extends Number> numbers = new HashSet<Float>();
			Set<? super Object> objects = new HashSet<Object>();
			List<?> list2  = new  ArrayList<String>();
			List<Integer> integers = new  ArrayList<>();
			integers.add(15);
			int value = integers.get(0);
			Integer integer = new Integer(10);
			Apple<Integer, String> apple = new Apple<>();
			apple.add(45);
			Integer.valueOf(145);
			String s1 = new String("bhoopendra");
			String s2 = new String("bhoopendra");
			if(s1==s2){
				System.out.println("Equals");
				ConcurrentHashMap<String, List<String>> hashMap = new ConcurrentHashMap<>();
			}
			
			
	}

}
