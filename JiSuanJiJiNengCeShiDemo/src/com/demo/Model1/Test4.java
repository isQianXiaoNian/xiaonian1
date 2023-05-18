package com.demo.Model1;

import java.util.Scanner;

public class Test4 {

	private void demo1 () {
		int a = new Scanner(System.in).nextInt();
		if (a%3+a%5+a%7==0) {
			System.out.println("3\5\7");
		}else if (a%3+a%5==0) {
			System.out.println("3¡¢5");
		} else if (a%3+a%7==0) {
			System.out.println("3\7");
		}else if (a%5+a%7==0) {
			System.out.println("5\7");
		}else if (a%5==0||a%3==0||a%7==0) {
			System.out.println("one");
		}else {
			System.out.println("no");
		}
	}
	
	private void demo2() {
		int a[] = {3,4,6,7,8,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]<a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		for (int i : a) {
			System.out.print(i);
		}
	}
	
	private void demo3 () {
		String a = "asdasdaaasdaaaasdasd";
		String b = "asd";
		int index=0;
		int count=0;
		while ((index=a.indexOf(b,index))!=-1) {
			index = index+b.length();
			count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Test4 test4 = new Test4();
//		test4.demo1();
		test4.demo2();
//		test4.demo3();
	}
}
