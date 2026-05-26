package com.tnsif.day2;

public class armstrong {

	public static void main(String[] args) {
		
	
		int num = 153;
	    int original = num;
	    int rem;
	    int sum = 0;

	    while(num > 0) {
	        rem = num % 10;
	        sum = sum + (rem * rem * rem);
	        num = num / 10;
	    }

	    if(sum == original) {
	        System.out.println("Armstrong Number");
	    } else {
	        System.out.println("Not an Armstrong Number");
	        }
	    }
       
	}


