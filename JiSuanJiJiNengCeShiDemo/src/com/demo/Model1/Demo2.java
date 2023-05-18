package com.demo.Model1;

public class Demo2 {
	private Double getTiJi(int r) {
		return Math.PI*r*r*r*4/3;
	}
	
	private Double zuobiao(int a,int b,int c,int d) {
		System.out.println(Math.pow(2, 4)); 
		System.out.println(Math.scalb(5, 2));

		return Math.sqrt((d-b)*(d-b)+(c-a)*(c-a));
	}
	
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		System.out.println(demo2.getTiJi(2));
		demo2.zuobiao(1, 2, 3, 4);
		System.out.printf("%s",demo2.zuobiao(1, 3, 4, 6));
	}
}
