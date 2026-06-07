package com.tnsif.Nonaccess;

public class FinalVariable {

	public static void main(String[] args) {
		int x=100; 
		x=200;
		
		final int y =100; 
		// y=200;  it will not change bcz y is having final value         
		
		System.out.println(x);
		System.out.println(y);

	}

}
