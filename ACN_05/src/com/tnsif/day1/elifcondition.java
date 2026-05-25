package com.tnsif.day1;

public class elifcondition {

	public static void main(String[] args) {
		int marks = 90;
		if(marks>=85 && marks<=100)
		{
			System.out.println ("A Grade");
		}
		else if(marks>=70 && marks<=84)
		{
			System.out.println("B Grade");
		}
		else if(marks>=50 && marks<=69)
		{
			System.out.println("C Grade");
		}
		else {
			System.out.println("Fail");
		}

	}

}
