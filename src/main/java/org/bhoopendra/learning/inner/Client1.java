package org.bhoopendra.learning.inner;


public class Client1 {

	public static void main(String[] args) {
			/*OuterClass outerClass = new OuterClass();
			InnnerClass innnerClass = outerClass.new  InnnerClass();
			innnerClass.show();*/
		OuterClass.InnnerClass innnerClass = new OuterClass.InnnerClass();
		innnerClass.show();
	}

}
