package org.bhoopendra.learning.abcvsi;

import java.io.FileNotFoundException;

public interface Engine {
	void run();
	void makeVoice() throws FileNotFoundException;
}
