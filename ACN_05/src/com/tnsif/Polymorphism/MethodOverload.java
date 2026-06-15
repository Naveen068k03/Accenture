package com.tnsif.Polymorphism;

public class MethodOverload {
	public void show()
	{
		System.out.println("This is show method with 0 paramentres");
	}
	public void show(double a)
	{
		System.out.println("This is show method with 1 paramentres "+a);
	}
	public void show(int a, float b)
	{
		System.out.println("This is show method with 2 paramentres "+a + "and"+b);
	}
	public void show(float a,int b,int c)
	{
		System.out.println("This is show method with 3 paramentres "+a + ","+b +"and"+c);
	}


}
