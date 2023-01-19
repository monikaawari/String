package com.string;

public class Test {
	public static void main(String[] args) {
		ImmutableClass e=new ImmutableClass("123654");
		String s=e.getPanCardNumber();
		System.out.println("pancard number is "+ s);	
	}
	
}
