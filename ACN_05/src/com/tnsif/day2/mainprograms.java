package com.tnsif.day2;

public class mainprograms {

	public static void main(String[] args) {
		//  print string
		String s = "naveen";
		for(int i=0;i<=5;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\n");
		
		// reverse of the string
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}


