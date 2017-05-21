package org.bhoopendra.learning.hackerrank.algo;

import java.security.NoSuchAlgorithmException;

public class MessageDigest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
		messageDigest.update("HelloBhoopendra".getBytes());
		byte[] bytes = messageDigest.digest();
		for(byte b:bytes){
			System.out.printf("%02x",b);
		}
	}

}
