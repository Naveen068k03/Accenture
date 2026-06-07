package com.tnsif.task1;

class Tickets
{
	int PNR;
	String passengerName;
	String trainName;
	
	static int totalTickets = 0;
	
	Tickets(int PNR, String passengerName, String trainName)
	{
		this.PNR = PNR;
		this.passengerName = passengerName;
		this.trainName = trainName;
		totalTickets ++;
	}
	
	void display() {
		System.out.println(PNR + " " + passengerName + " --- "+ trainName);
	}	
}


class Sleeper extends Tickets
{
	Sleeper(int PNR, String passengerName, String trainName)
	{
		super(PNR, passengerName, trainName);
	}
}

class SecAC extends Tickets
{
	SecAC(int PNR, String passengerName, String trainName)
	{
		super(PNR, passengerName, trainName);
	}
}

class ThirdAC extends Tickets
{
	ThirdAC(int PNR, String passengerName, String trainName)
	{
		super(PNR, passengerName, trainName);
	}
}

public class railway {

	public static void main(String[] args) {
		Sleeper s = new Sleeper(603, "Nani", "Janmabumi Express");
		SecAC a = new SecAC(603, "Achu", "Janmabumi Express");
		ThirdAC t = new ThirdAC(477, "Prachu", "Falakanama Express");
		
		
		s.display();
		a.display();
		t.display();
		
		System.out.println(" ");
		System.out.println("Total Tickets Booked: "+ Tickets.totalTickets);

	}

}
