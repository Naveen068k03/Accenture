package com.tnsif.Nonaccess.Abstract;

abstract class superclass
{
	abstract public void display();
    public void show() 
    {
    	System.out.println("This is a non abstract method");
    }
}
class subclass extends superclass
{
    public void display()
    {
        System.out.println("This is an abstract class");
    }
}

public class abstractclass {

	public static void main(String[] args) {
			subclass s = new subclass();
			s.display();
			s.show();


	}

}
