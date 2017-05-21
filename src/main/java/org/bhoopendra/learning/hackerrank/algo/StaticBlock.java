package org.bhoopendra.learning.hackerrank.algo;

public class StaticBlock {

	{
		System.out.println("Intance Block");
	}

	static {
		System.out.println("static Block");
	}

	public static void main(String[] args) {
		StaticBlock StaticBlock = new StaticBlock();
		StaticBlock StaticBlock2 = new StaticBlock();
		StaticBlock StaticBlock3 = new StaticBlock();
	}

}
