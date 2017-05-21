package org.bhoopendra.learning.hackerrank.algo;

import java.lang.reflect.Method;

import org.bhoopendra.learning.generics.beans.Animal;

public class Reflection {

	public static void main(String[] args) {
		Class animal = Animal.class;
		Method[] allmethods = animal.getDeclaredMethods();
		for(Method method : allmethods){
			System.out.println(method.getName());
		}
	}

}
