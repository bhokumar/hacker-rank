package org.bhoopendra.learning.hackerrank.algo;

import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	PerformOperation is_prime() {
		PerformOperation b = (a) -> {
			boolean flag = true;
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0) {
					flag = false;
				}
			}
			return flag;
		};

		return b;
	}

	PerformOperation is_odd() {
		PerformOperation b = (a) -> {
			int result = a & 1;
			if (result == 1) {
				return true;
			} else {
				return false;
			}
		};
		return b;
	}

	PerformOperation is_palindrome() {
		PerformOperation b = (a) -> {
			int temp = a;
			int result = 0;
			while (temp > 0) {
				result = result * 10 + temp % 10;
				temp = temp / 10;
			}
			if (result == a)
				return true;
			else
				return false;
		};
		return b;
	}

}

public class Solution {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.is_odd();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.is_prime();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.is_palindrome();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}