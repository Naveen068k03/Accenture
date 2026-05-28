package com.tnsif.day4.inheritance;

/* Create a class Animal with a method sound()
Create another class Dog that inherits from Animal
Print both methods using object of child class */

class Animal
{
	void sound()
	{
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal
{
	void bowbow()
	{
		System.out.println("dog sound's bowbow");
	}
}
public class animaltask {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.sound();
		d.bowbow();
		

	}

}
