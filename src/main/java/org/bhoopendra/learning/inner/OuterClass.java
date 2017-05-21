package org.bhoopendra.learning.inner;

public class OuterClass {
	int i=100;
	public void show(){
		System.out.println("bhoopendra");
	}
	static class InnnerClass{
		public  void  show(){
			System.out.println("show method");
			
			class MethodLocal{
				public void display(){
					System.out.println("display method");
				}
			}
			
			MethodLocal methodLocal = new MethodLocal();
			methodLocal.display();
		}
	}
}
