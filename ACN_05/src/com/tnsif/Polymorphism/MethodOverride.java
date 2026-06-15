package com.tnsif.Polymorphism;

public class MethodOverride {
	public void build()
	{
		System.out.println("My father constructed 2 floors building");
	}
}
class child extends MethodOverride{
	public void build() {
		System.out.println("I Reconstructed it to 3 floors building");
	}
}
