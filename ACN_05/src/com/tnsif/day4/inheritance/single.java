package com.tnsif.day4.inheritance;

class Os
{
	void boot()
	{
		System.out.println("System Boots");
	}
}

class Windows extends Os
{
	void version()
	{
		System.out.println("Windows version");
	}
}

public class single {

	public static void main(String[] args) {
		Windows w = new Windows();
		
		w.version();
		

	}

}
