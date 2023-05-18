package com.demo.Model1;

import java.util.Scanner;

public class Demo1 {
	Scanner scanner = new Scanner(System.in);
	private int getDay (int year,int mouth,int day,int outDay) {
		mouth -=1;
		while (mouth>0) {
			switch (mouth) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				outDay +=31;
				mouth--;
				break;
			case 2:
				outDay +=28;
				mouth--;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				outDay +=30;
				mouth--;
				break;
			default:
				break;
			}
		}
		outDay += day;
		return outDay;
	}
	private int getday1(int year,int mouth,int day,int outDay) {
		outDay = 0;
		for (int i = 1; i < mouth; i++) {
			if (i==2) {
				outDay +=28;
			} else if (i==4||i==6||i==9||i==11) {
				outDay +=30;
			} else {
				outDay +=31;
			}
		}
		outDay +=day;
		return outDay;
	}
	
	private void chenfa() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +"*"+ i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	private Boolean shuixianhua(int num) {
		Boolean is = true;
		if (num==((num%10)*(num%10)*(num%10))+
				((num/10%10)*(num/10%10)*(num/10%10))+
				((num/100)*(num/100)*(num/100))) {
			return is;
		}
		return false;
	}
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		
		System.out.println(demo1.getDay(2000,4, 1, 0));
		System.out.println(demo1.getday1(2000, 4, 1, 0));
		demo1.chenfa();
		System.out.println(demo1.shuixianhua(153));
	}
	
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("请输入年份：");
//	        int year = scanner.nextInt();
//	        System.out.print("请输入月份：");
//	        int month = scanner.nextInt();
//	        System.out.print("请输入日期：");
//	        int day = scanner.nextInt();
//	        int days = getDays(year, month, day);
//	        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天。");
//	    }
//	    public static int getDays(int year, int month, int day) {
//	        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//	        int days = day;
//	        for (int i = 0; i < month - 1; i++) {
//	            days += daysOfMonth[i];
//	        }
//	        if (isLeapYear(year) && month > 2) {
//	            days++;
//	        }
//	        return days;
//	    }
//	    public static boolean isLeapYear(int year) {
//	        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
//	    }
//	
}
