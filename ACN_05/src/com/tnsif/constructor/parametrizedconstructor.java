package com.tnsif.constructor;

public class parametrizedconstructor {
	int id ;
	String name ;
	
	parametrizedconstructor(int id, String name){   
		this.name = name;
		this.id = id;	
	}
	
	
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
		

	public static void main(String[] args) {
		parametrizedconstructor obj = new parametrizedconstructor(603, "Nani");   
		obj.display();

	}

}
