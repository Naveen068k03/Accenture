package com.tnsif.day4.inheritance;

class Employe
{
	void work()
	{
		System.out.println("Employee working");
	}
}
class Develope extends Employe
{
	void code()
	{
		System.out.println("writing code");
		System.out.println("");
		
	}
}

class Teste extends Employe
{
	void testing()
	{
		System.out.println("Testing Application");
	}
}
public class hierarchical {

	public static void main(String[] args) {
		
		Develope d = new Develope();
		Teste t = new Teste();
		
		d.work();
		d.code();
		
		t.work();
		t.testing();
		
		

	}

}
