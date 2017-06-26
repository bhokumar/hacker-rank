package org.bhoopendra.learning.hackerrank.algo;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.bhoopendra.learning.generics.beans.Animal;

public class Reflection {

	public static void main(String[] args) {
		Class animal = Animal.class;
		Method[] allmethods = animal.getDeclaredMethods();
		for(Method method : allmethods){
			System.out.println(method.getName());
		}
		Map<String, String> listOfEmployee = new HashMap<>();
		listOfEmployee.put("emp1", "8860634724");
		System.out.println(listOfEmployee.get("emp12"));
	}

}
