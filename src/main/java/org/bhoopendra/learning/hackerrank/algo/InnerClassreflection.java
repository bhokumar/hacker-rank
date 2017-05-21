package org.bhoopendra.learning.hackerrank.algo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InnerClassreflection {

	static class Innner{
		private class Private{
			private void show(){
				System.out.println("show method");
			}
		}
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class privateClass = InnerClassreflection.Innner.Private.class;
		Method[] methods = privateClass.getDeclaredMethods();
		InnerClassreflection classreflection = new InnerClassreflection();
		Innner innner = new Innner();
		org.bhoopendra.learning.hackerrank.algo.InnerClassreflection.Innner.Private instance = innner.new Private();
		for(Method method : methods){
			method.setAccessible(true);
			method.invoke(instance,null);
		}
	}

}
