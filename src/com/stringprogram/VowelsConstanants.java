package com.stringprogram;

public class VowelsConstanants {
	public static void main(String[] args) {
		String s="This is a really simple sentence";
		int vcount=0;
		int ccount=0;
		String str=s.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vcount++;
			}else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				ccount++;
			}
		}System.out.println("total number of vovewls are :" +vcount);
         System.out.println("Total number of Constanant counts are: "+ccount);
	}

}
