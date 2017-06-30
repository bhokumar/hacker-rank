package org.bhoopendra.learning.abcvsi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class IsroCryogenicEngine extends CryogenicEnegine {

	@Override
	public void makeVoice() throws FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream("logt.txt")));
		System.out.println("providing implementation");
	}
	
	@Override
	public void run() {
		System.out.println("overriding default behaviour");
	}
}
