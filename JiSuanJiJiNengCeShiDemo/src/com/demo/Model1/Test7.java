package com.demo.Model1;

public class Test7 {

	private void demo1() {
		int a[]={1,9,3,7,4,2,5,0,6,8};
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if (a[i]<a[j]) {
//					int b = a[i];
//					a[i] = a[j];
//					a[j] = b;
//				}
//			}
//		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		Test7 test7 = new Test7();
		test7.demo1();
	}
}
