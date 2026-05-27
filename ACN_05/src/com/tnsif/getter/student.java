package com.tnsif.getter;

public class student {
	private int stsid;
	private String stdname;
	private double marks;
	public String clgname;
	
	public int getStsid() {
		return stsid;
	}
	public void setStsid(int stsid) {
		this.stsid = stsid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	@Override
	public String toString() {
		return "student [stsid=" + stsid + ", marks=" + marks + "]";
	}
	

}
