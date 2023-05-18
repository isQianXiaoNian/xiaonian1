package com.demo.Model2;

import java.util.Iterator;

public class Test1 {

	private void demo1() {
		int z = 48;
		for (int i = 1; i <= z; i++) {
			if (i*4+(48-i)*3==172) {
				System.out.printf("汽车:%s摩托车:%s",i,48-i);
				System.out.println();
			}
		}
	}
	private void demo2() {
		int num = 500;
		for (int i = 0; i <= num*6; i++) {
			if ((num*6-i)*0.5-(i*10)==1332) {
				System.out.println(i);
			}
		}
	}
	
	private void demo3() {
		int num = 500*4;
		for (int i = 0; i <= num; i++) {
			if (i*5-(num-i)*18==9931) {
				System.out.println("合格："+i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 test1 = new Test1();
		test1.demo1();
		test1.demo2();
		test1.demo3();
	}

}
