package com.tnsif.day1;

public class switchcondition {

	public static void main(String[] args) {
		int day = 0;
		char grade = 'A';
		String fruit = "Apple";
		switch(day)
		{
		case 0 : System.out.println("Mon"); break;
		case 1 : System.out.println("Tue"); break;
		case 2 : System.out.println("Wed"); break;
		case 3 : System.out.println("Thu"); break;
		case 4 : System.out.println("Fri"); break;
		case 5 : System.out.println("Sat"); break;
		case 6 : System.out.println("Sun"); break;
		default : System.out.println("Invalid Input");
		}
		
	//ex = 2
		switch(grade)
		{
		case 'A' : System.out.println("Excellent"); break;
		case 'B' : System.out.println("Good"); break;
		case 'C' : System.out.println("Averg"); break;
		default : System.out.println("Fail"); break;
		}
//ex = 3
		switch(fruit)
		{
		case "Apple" : System.out.println("Red"); break;
		case "Banana" : System.out.println("Yellow"); break;
		case "Mango" : System.out.println("Green"); break;
		default : System.out.println("unknow ");
		}
	}

}
