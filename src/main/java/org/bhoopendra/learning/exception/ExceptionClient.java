package org.bhoopendra.learning.exception;

public class ExceptionClient {

	public static void main(String[] args) {
	ExceptionClient client = new ExceptionClient();
		try {
			client.test();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		try{
		client.show();
		}catch (Error e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void test() throws Throwable{
		throw new Throwable("this is message");
	}
	
	private void show() throws Error{
		throw new Error("this is error");
	}

}
