package com.tnsif.scanner;

import java.util.Scanner;

public class demo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your ID: ");
		int id = sc.nextInt();
		System.out.print("Enter your Name: ");
		String name = sc.next();
		System.out.print("Enter your Marks: ");
		double marks = sc.nextDouble();
		
		System.out.println("Enter your ID: "+id+ "Enter your Name: "+name+ "Enter your Marks: "+marks);
	}

}
