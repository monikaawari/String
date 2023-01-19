package com.stringprogram;

public class CountChar {
	public static void main(String[] args) {
		String str="monika awari";
	int count =0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			count++;
			
		}
	}System.out.println("total number of character in the string are :"+count);
	
	
	}

}
