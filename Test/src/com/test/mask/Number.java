package com.test.mask;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer amount=52500;
		float surcharge=amount/100;
		String surcharge1=String.valueOf(surcharge);
		String surcharge2=surcharge1.substring(0,surcharge1.length()-2);
		System.out.println(surcharge2);

	}

}
