package com.tnsif.Str;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("welcome");
		System.out.println(s);
		System.out.println(s.append('!'));
		System.out.println(s);
		System.out.println(s.substring(3,7));
		
		

	}

}
