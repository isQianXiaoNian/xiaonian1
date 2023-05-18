package com.demo.Model1;

import java.util.Iterator;
import java.util.Scanner;

public class Demo3 {
	
	private void ta(int x) {
		for (; x > 0;) {
//			for (int i = x; i<=x; i--) {
//				System.out.printf(" ");
//			}
			for (int j =0; j < x; j++) {
				System.out.printf("*");
			}
			x -=2;
			System.out.println();
		}
	}
	
	private void demo2() {
		int a[]= {3,4,23,23,22,45,6,65,3,2,1,8};
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>b) {
				b = a[i];
			}
		}
		System.out.println(b);
	}
	
	private void demo3 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÊäÈë£º");
		int a = scanner.nextInt();
		int b = 1;
		for (; a>10;) {
			b *= a%10;
			a /=10;
		}
		b *=a;
		System.out.println(b);
	}
	public static void main(String[] args) {
		Demo3 demo3 = new Demo3();
//		demo3.ta(7);
//		demo3.demo2();
		demo3.demo3();
	}
}
