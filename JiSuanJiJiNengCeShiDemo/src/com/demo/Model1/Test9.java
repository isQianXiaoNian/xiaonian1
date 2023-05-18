package com.demo.Model1;

import java.util.Scanner;

public class Test9 {

	Scanner scanner = new Scanner(System.in);
	private void demo1() {
		int a = 100;
		int sum = 0;
		while (a>0) {
			if (a%3+a%7==0) {
				sum +=a;
			}
			a--;
		}
		System.out.println(sum);
	}
	
	private void demo2() {
		int n = scanner.nextInt();
		int sum = 0;
		while (n>0) {
			if (n%3+n%7==0) {
				sum +=n;
			}
			n--;
		}
		System.out.println(Math.sqrt(sum));
	}
	
	private void demo3() {
		int a = scanner.nextInt();
		int num = a;
		int s = 0;
		for (int i = 0; i < a; i++) {
			s +=num;
			num = Integer.parseInt(num+""+a);
			num = num*10 +a;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Test9 test9 = new Test9();
		test9.demo1();
//		test9.demo2();
		test9.demo3();
	}
}
