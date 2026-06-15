package com.tnsif.superclass;

public class Animal {
	String colour = " Borwn";
	public void sound()
	{
		System.out.println("The Animal Sound");
	}
	Animal()
	{
		System.out.println("This is Animal Counstructor");
	}

}

class Dog extends Animal
{
	String colour = "black";
	{
		System.out.println("Dog Barks");
		System.out.println("The colour of animal is: "+ super.colour);
		super.sound();
		
	}
	Dog()
	{
		System.out.println("This is Dog Counstructor");
		super();
	}
}
