package com.tnsif.Nonaccess;

public class FinalMethod {
	void sub() {
	    
	        int a = 20, b = 15;
	        System.out.println("The sum is: " + (a - b));
	    }

	public static void main(String[] args) {
		Child c = new Child();
        c.sub();
    }
    
    
}

class Child extends FinalMethod {
	
    void sub() {
        int a = 20, b = 15, c = 2;
        System.out.println("The sum is: " + (a - b - c));

	}

}
