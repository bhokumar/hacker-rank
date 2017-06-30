package org.bhoopendra.learning.thread.limitation;

public class Limitation {
	static Limitation obj;
	private static int count = 0;;

	public Limitation() {
		count++;
	}

	public static Limitation getInstance() {
		if (count < 3) {
			obj = new Limitation();
		} else {
			obj = null;
		}
		return obj;
	}
	
	void msg()
	{
		System.out.println("mesage");
	}
}
