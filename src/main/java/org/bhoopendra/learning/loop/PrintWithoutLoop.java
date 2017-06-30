package org.bhoopendra.learning.loop;

public class PrintWithoutLoop {
	
	void printValue(final int n){
		if(n<=10){
			System.out.println(n);
			printValue(n+1);
		}
	}

	public static void main(String[] args) {
		new PrintWithoutLoop().printValue(0);
	}

}
