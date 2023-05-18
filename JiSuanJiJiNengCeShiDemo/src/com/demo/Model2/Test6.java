package com.demo.Model2;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {

	private void demo1() {
		double a[] = {9.8,12,45,67,23,1.98,2.55,45};
		System.out.println(Arrays.stream(a).max().getAsDouble());
		System.out.println(Arrays.stream(a).min().getAsDouble());
		System.out.println(Arrays.stream(a).average().getAsDouble());
	}
	
	private void demo2() {
		double h = 100;
		double x = 0;
		for (int i = 0; i <10; i++) {
			x += 3*h/2;
			h /=2;
		}
		System.out.println(x +" "+h);
	}
	
	private void demo3() {
		System.out.println("ÊäÈëÕûÊý£º");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = (n-i); j >0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1; i > 0; i--) {
			for (int j = (n-i); j >0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 2*i-1; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Test6 test6 = new Test6();
//		test6.demo1();
//		test6.demo2();
		test6.demo3();
	}
}
