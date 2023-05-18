package com.demo.Model1;

import java.util.Scanner;

public class Test5 {

	private void demo1 () {
		String s = "adafdfa";
		if (s.length()==7) {
			s = s.replace("a", "-");
		}
		System.out.println(s);
	}
	
	public static String getType(Object obj) {
		return obj.getClass().getTypeName();
	}
	private void demo3() {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		int count = 0;
		int index = 0;
		while (s1.length()>0) {
			if (index==s1.length()) {
				break;
			}
			try {
				Integer.parseInt((s1.substring(index,index+1)));
				count++;
			} catch (Exception e) {
				// TODO: handle exception
			}
			index++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 test5 = new Test5();
//		test5.demo1();
		test5.demo3();
	}

}
