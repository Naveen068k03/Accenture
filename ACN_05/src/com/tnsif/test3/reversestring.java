package com.tnsif.test3;

public class reversestring {

	public static void main(String[] args) {
		String s = "Programming";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println("Reversed String: " + rev);

	}

}
