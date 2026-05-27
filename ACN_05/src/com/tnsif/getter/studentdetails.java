package com.tnsif.getter;

public class studentdetails {

	public static void main(String[] args) {
		student std = new student();
		std.setStsid(17);
		std.setStdname("nani");
		std.setMarks(92);
		std.setClgname("MRCET");
		System.out.println(std.getStsid());
		System.out.println(std.getStdname());
		System.out.println(std.getMarks());
		System.out.println(std.getClgname());
		
		std.getStsid();

	}

}
