package org.bhoopendra.learning.abcvsi;

public class IsroCryogenicEngine extends CryogenicEnegine {

	@Override
	public void makeVoice() {
		System.out.println("providing implementation");
	}
	
	@Override
	public void run() {
		System.out.println("overriding default behaviour");
	}
}
