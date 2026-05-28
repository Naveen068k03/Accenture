package com.tnsif.day4.inheritance;

class Computer {
	void poweron()
	{
		System.out.println("computer power on");
	}
}

class Laptop extends Computer
{
	void portable()
	{
		System.out.println("Portable Device");
	}
}

class GaminingLaptop extends Laptop
{
	void gpu()
	{
		System.out.println(" Gaming Laptop having High GPU");
	}
}

public class multi {

	public static void main(String[] args) {
		GaminingLaptop gl= new GaminingLaptop();
		
		gl.gpu();

	}

}
