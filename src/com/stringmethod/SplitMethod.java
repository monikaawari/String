package com.stringmethod;

public class SplitMethod {
	
	public static void main(String[] args) {
		String s="my name is monika";
		
		String[] str=s.split(" ");
		
		for(String s1:str) {
			System.out.println(s1);
		}
	}

}
