package org.bhoopendra.learning.inheritance;

public class InharitanceClient {

	public static void main(String[] args) {
		Parent.show();
		Child.show();
	}

}

class Parent{
	public static void show(){
		System.out.println("show method of parent !");
	}
}

class Child extends Parent{
	public static void show(){
		System.out.println("Show method of child class!");
	}
}