package com.study;

public class ExceptionHandler {

	public static String getName() {
		System.out.println("1");
		try {
			String s1 = null;
			s1.toString();		
			System.out.println("2");
			return "2";
		} catch(Exception e) {
			System.out.println("3");
			return "3";
		} finally {
			System.out.println("4");
			//any return from finally block will be overridden
			//return "4";
		}
	}
	
	public static void main(String s[]) {
		System.out.println(getName());
	}
}
