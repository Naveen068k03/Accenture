package com.tnsif.Nonaccess;

public class Final {
	void add() 
	{
        int a = 20, b = 15;
        System.out.println("The sum is: " + (a + b));
	}

	public static void main(String[] args) {
		System.out.println("final class ");
		Final f = new Final();
        f.add();

	}

}
