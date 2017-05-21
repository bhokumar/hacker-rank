package org.bhoopendra.learning.hackerrank.algo;

public class VarArgClass {

	public static void main(String[] args) {
		System.out.println(0);
	}
	
	static int add(int... a){
		 int sum = 0;
	        for(int b:a){
	        	sum = sum+b;
	        }
	        return sum;
	}
}
