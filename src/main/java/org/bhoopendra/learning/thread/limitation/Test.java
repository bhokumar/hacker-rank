package org.bhoopendra.learning.thread.limitation;

class Test
{
	public static void main(String[] args) {
		Limitation l1=Limitation.getInstance();
		Limitation l2=Limitation.getInstance();
		Limitation l3=Limitation.getInstance();
		Limitation l4=Limitation.getInstance();
		l1.msg();
		l2.msg();
		l3.msg();
		l4.msg();
	}
}