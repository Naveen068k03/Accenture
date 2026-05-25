package com.tnsif.day1;
import java.util.*;

public class operatores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean c = true, d = false;

		// Arithmetic Operators
				System.out.println("\nArithmetic Operators");
				System.out.println("Add: "+(a+b));
				System.out.println("Sub: "+(a-b));
				System.out.println("Mul: "+(a*b));
				System.out.println("Div: "+(a/b));
				System.out.println("mod: "+(a%b));

		// Relational operators
				System.out.println("\nRelational operators");
				System.out.println("a == b: "+(a == b));
//				System.out.println("a != b: "+(a != b));
//				System.out.println("a > b: "+(a > b));
//				System.out.println("a < b: "+(a < b));
//				System.out.println("a >= b: "+(a >= b));
//				System.out.println("a <= b: "+(a <= b));
				
		// Logical Operators
				System.out.println("\nLogical Operators");
				System.out.println("c && d: "+(c && d));
//				System.out.println("c || d: "+(c || d));
//				System.out.println(" !(c<d): "+!(c<d));
				
		// Assignment Operaters
				System.out.println("\nAssignment Operaters");
				System.out.println("a += b: "+(a += b));
//				System.out.println("a -= b: "+(a -= b));
//				System.out.println("a *= b: "+(a *= b));
//				System.out.println("a /= b: "+(a /= b));
//				System.out.println("a %= b: "+(a %= b));
				
		// Bitwise Assignment Operators
				System.out.println("\nBitwise Operators");
//				System.out.println("a & b: "+(a & b));
				System.out.println("a | b: "+(a | b));
//				System.out.println("a ^ b: "+(a ^ b));
				System.out.println("-a: "+ (-a));
//				System.out.println("a << 1: "+(a << 1));
//				System.out.println("a >> 1: "+(a >> 1));
		
		//Unary Operator
				System.out.println("\nUnary Operator");
				System.out.println("a  : "+ a);
//				System.out.println("++ a: "+ (++a);
//				System.out.println("--a: "+(--a));
//				System.out.println("a++: "+(a++));
//				System.out.println("a after a++: "+ a);
//				System.out.println("a-- : "+ (a--));
//				System.out.println("a after a--:"+ a)
				
		// Ternary Operator 
				int age = 18;
				System.out.println("\n Ternary Operator ");
				String result = (age >=18) ? "Eligible for Voting" : "Not Eligible for Voting";
				System.out.println(result);
				
		//Instance of Operator
				System.out.println("\n Instanceof Operator ");
				String name = "Naveen";
				System.out.println(name instanceof String);
				
				sc.close();
	}

}
