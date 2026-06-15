package com.tnsif.test3;

public class StringCount {

	public static void main(String[] args) {
		String str = "Hello";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);

	}

}
