package com.demo.Model1;

import java.util.Scanner;

public class Test6 {

	
	private void demo1() {
		double a[] = {9.8,12,45,67,23,1.98,2.14,45};
		double sum = 0;
		double max = 0;
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
			if (a[i]<min) {
				min = a[i];
			}
			sum += a[i];
		}
		System.out.printf("´ó£º%.2fÐ¡£º%fÆ½%f",max,min,sum/a.length);
	}
	
	private void demo2() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum += Integer.parseInt(2+""+i);
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test6 test6 = new Test6();
//		test6.demo1();
		test6.demo2();
	}

}
