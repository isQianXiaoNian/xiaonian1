package com.demo.Model2;

import java.util.Scanner;

public class Test5 {

	Scanner scanner = new Scanner(System.in);
	private boolean demo1(int n) {
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <i; j++) {
				if (i%j==0&&i!=j) {
					break;
				}
				if (j==i-1) {
					System.out.print("素数："+i);
				}
			}
		}
		return true;
	}
	
	private void demo2() {
		String s = scanner.nextLine();
		char c[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (Character.isSpace(c[i])) {
				count ++;
			}
		}
		System.out.println(count);
	}
	
	private void demo3() {
		int n = scanner.nextInt();
		int a[] = new int[n];
		int z = 0,f = 0,l = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("输入第"+(i+1)+"个数");
			a[i] = scanner.nextInt();
			if (a[i]>0) {
				z++;
			}
			if (a[i]==0) {
				l++;
			}
			if (a[i]<0) {
				f++;
			}
		}
		System.out.println("正"+z+"零"+l+"负"+f);
		
	}
	
	public static void main(String[] args) {
		Test5 test5 = new Test5();
		test5.demo1(10);
		test5.demo2();
//		test5.demo3();
	}
}
