package com.tnsif.day2;

public class charreverseofarray {

	public static void main(String[] args) {
		// revers of Array char
		char[] arr = {'N','A','V','E','E','N'};
		int start = 0;
		int end = arr.length-1;
		
		while (start < end)
		{
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("Reversed Array: ");
		
		for (char ch: arr)
		{
			System.out.print(ch + " ");
		}
	}

}
