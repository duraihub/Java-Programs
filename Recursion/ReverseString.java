package com.durai;

public class ReverseString {

	public static void main(String[] args) {
		String s="Hi i am durai";
		reverse(s);
	}
	public static void reverse(String s) {
		
		if(s.length()<=1 || s==null) {
			System.out.print(s);
		}else {
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
		
	}

}
