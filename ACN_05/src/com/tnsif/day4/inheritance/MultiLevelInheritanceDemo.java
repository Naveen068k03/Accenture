package com.tnsif.day4.inheritance;

class Device
{
	void deviceType()
	{
		System.out.println("Iam an electronic device");
	}
}
class Phone extends Device
{
	void brand()
	{
		System.out.println("Samsung");
	}
}
class SmartPhone extends Phone
{
	void features()
	{
		System.out.println("Features :Touchscreen,Calling connection");
	}
}

public class MultiLevelInheritanceDemo {
	

	public static void main(String[] args) {
		SmartPhone smart=new SmartPhone();
		smart.deviceType();
		smart.brand();
		smart.features();

	}

}
