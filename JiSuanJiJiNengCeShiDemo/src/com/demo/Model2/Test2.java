package com.demo.Model2;

import java.util.Scanner;

public class Test2 {

	Scanner scanner = new Scanner(System.in);
	private void demo1() {
		System.out.println("输入鸡兔的数量：");
		int n = scanner.nextInt();
		System.out.println("输入鸡兔的腿数量：");
		int m = scanner.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i*2+(n-i)*4==m) {
				System.out.println("鸡："+i+"兔："+(n-i));
			}
		}
		System.out.println("NO answer");
		
	}
	
	private void demo2(int x,int sum) {
		for (int i = 1; i < x; i++) {
			if (x%i==0) {
				sum +=i;
			}
		}
		if (sum==x) {
			System.out.println("shi");
		}else {
			System.out.println("bushi");
		}
	}
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
//		test2.demo1();
		test2.demo2(28, 0);
	}
}
