package com.tnsif.task1;

class Patient
{
	String name;
	int roomno;
	String disease;
	
	Patient( String name,int roomno, String disease )
	{
		this.name = name;
		this.roomno = roomno;
		this.disease = disease;	
	}
	void display(){
		System.out.println(name+" "+roomno+" "+disease);
	}
}

public class Hospital {

	public static void main(String[] args)
	{
		Patient p1 = new Patient("ram", 101, "Heart");
		Patient p2 = new Patient("charan", 102, "Infection");
		Patient p3 = new Patient("raju", 201, "Abnormal condition");
		Patient p4 = new Patient("gopal", 202, "Heart");
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();

	}

}
