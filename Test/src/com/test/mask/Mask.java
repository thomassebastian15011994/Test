package com.test.mask;

public class Mask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="1234567890123456";
	String sample=	S.substring(5,11).replaceAll("[0-9]", "*");
		System.out.println(sample);

	}

}
