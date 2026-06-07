package com.tnsif.task1;

class cab
{
	String cabtype;
	double fair;
	
	static int totalrides=0;
	
	cab(String cabtype, double fair){
		this.cabtype = cabtype;
		this.fair = fair;
		totalrides++;
	}
	
	void display() {
		System.out.println(cabtype+" Fare: "+fair);
	}
}
class Uber extends cab{
	Uber(String cabType, double fair){
		super(cabType, fair);
	}
}

class rapido extends cab{
	rapido(String cabType, double fair){
		super(cabType, fair);
	}
}

public class cabbooking {

	public static void main(String[] args) {
		Uber u = new Uber("Uber", 250);
		rapido r = new rapido("rapido", 230);
		
		u.display();
		r.display();
		
		System.out.println(" ");
		System.out.println("Total Rides: " + cab.totalrides);


	}

}
