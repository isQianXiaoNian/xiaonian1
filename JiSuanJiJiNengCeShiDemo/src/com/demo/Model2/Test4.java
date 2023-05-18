package com.demo.Model2;

public class Test4 {

	private void demo1() {
		for (int i = 0; i < 82.3/2.3; i++) {
			for (int j = 0; j < 82.3/1.9; j++) {
				if (2.3*i+1.9*j==82.3&&i<j) {
					System.out.println("Æ¡¾Æ£º"+i);
				}
			}
		}
	}
	
	private int name(int a) {
		int num = 1;
		for (int i = 1; i <= a; i++) {
			num *=i;
		}
		return num;
	}
	private void demo2(int a,int b,int c) {
		int sum = 0;
		sum+=name(a);
		sum+=name(b);
		sum+=name(c);
		System.out.println(sum);
	}
	
	private void demo3() {
		String str = "abcdefghijklmnopqrs";
		StringBuffer strs = new StringBuffer();
		for (int i = 0; i < 106; i++) {
			strs.append(str);
		}
		for (; strs.length() > 1;) {
			StringBuffer s = strs;
			for (int i = 0;i<s.length(); i++) {
				s.deleteCharAt(i);	
			}
			strs = s;
		}
		System.out.println(strs);
	}
	
	public static void main(String[] args) {
		Test4 test4 = new Test4();
		test4.demo1();
		test4.demo2(2, 4, 5);
		test4.demo3();
	}
}
