package com.demo.Model1;

import java.util.Iterator;
import java.util.Scanner;

public class Test10 {

	Scanner scanner = new Scanner(System.in);
	private void demo1() {
		double h = 100;
		double x = 0;
		for (int i = 0; i < 10; i++) {
			x += 1.5*h;
			h /=2;
		}
		System.out.println(x+" "+h);
	}
	
	private void demo2() {
		int t[] = new int[62];
		int g = 0;
		int index = 0;
		for (int i = 0; i < t.length; i++) {
			if (i==index+g) {
				g +=1;
				t[i] = 1;
				index +=g;
			}
		}
		int ja[] = new int[62];
		int day = 0;
		int a[] = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
		if (a[2]==7) {
			day = a[3]-a[1];
		}
		if (a[2]==8) {
			if (a[0]==8) {
				day = a[3]-a[1];
			}else {
				day = a[3]+31;
			}
		}
		for (int i = a[1]-1; i < day; i++) {
			ja[i] = 1;
		}
		int count = 0;
		for (int i = 0; i < t.length; i++) {
			if (ja[i]==1&&t[i]==1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	private void demo3() {
		char a[] = scanner.next().toCharArray();
		int index = a.length%2==1?a.length/2+1:a.length/2;
		char b[] = new char[index];
		for (int i = a.length-1; i >= 0; i-=2) {
				b[index-1] = a[i];
				index--;
		}
		for (char c : b) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		Test10 test10 = new Test10();
		test10.demo1();
//		test10.demo2();
		test10.demo3();
	}
}
