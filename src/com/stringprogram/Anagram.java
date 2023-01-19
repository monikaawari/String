package com.stringprogram;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a="monikA";
		String b="aknioM";
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.length()!=b.length()) {
			System.out.println("String is not anagram");
		}else {
			char []a1=a.toCharArray();
			char[]b1=b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            
          if(Arrays.equals(a1, b1)) {
        	  System.out.println("String is anagram");
          }else {
        	  System.out.println("String is not anagram");
          }
		
		}
		
	}

}
