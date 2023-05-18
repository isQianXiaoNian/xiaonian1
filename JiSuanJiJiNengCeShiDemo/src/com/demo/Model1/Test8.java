package com.demo.Model1;

import java.util.Scanner;

public class Test8 {

	private void demo1() {
		String A [] = {"Hello " , "Hello " , "Hello " , "Hello " , "Hello " };
		String B [] = {"Hello Jack" , "Hello Tom" , "Hello Lee" , "Hello John" , "Hello Alisa" };
		String C [] = new String[A.length];
		if (A.length>=B.length) {
			for (int i = 0; i < A.length; i++) {
				C[i] = A[i] + B[i];
			}
		}
		for (String string : C) {
			System.out.println(string);
		}
	}
	
	private void demo2() {
		String a = "abbba";
		char c[] = a.toCharArray();
		String b[] = new String[a.length()];
		for (int i = 0; i < a.length()-1; i++) {
			if (a.substring(i, i+1).equals(a.substring(a.length()-1-i, a.length()-i))) {
			}else {
				System.out.println("no");
				break;
			}
			if (i==a.length()/2) {
				System.out.println("yes");
				break;
			}
		}
	}
	
	private void demo3() {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		char a[] = scanner.next().toCharArray();
		Character.isLowerCase(a[0]);
		for (char c : a) {
			if ((int)c<=122&&(int)c>=97) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Test8 test8 = new Test8();
		test8.demo3();
	}
}
