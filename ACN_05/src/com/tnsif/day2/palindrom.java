package com.tnsif.day2;

public class palindrom {

	public static void main(String[] args) {
		// Palindrom
		String p = "madam";
		String rev = "";
		for(int j= p.length() -1; j>=0; j--)
		{
			rev = rev + p.charAt(j);
		}
		
		if(rev.equals(p))
		{
			System.out.println("Palindrom");
		}else
		{
			System.out.println("Not a Palindrom");
		}
	}

}
