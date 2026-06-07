package com.tnsif.task1;

class book
{
	int bookcode;
	String Bookname;
	
	book(int bookcode, String Bookname)
	{
		this.bookcode = bookcode;
		this.Bookname = Bookname;
	}
	void display() {
		System.out.print(bookcode +" "+ Bookname);
	}
}

public class Library {

	public static void main(String[] args) {
		book c = new book(01, "Maths");
		book n = new book(02, "English");
		
		c.display();
		System.out.println("\n");
		n.display();

	}

}
