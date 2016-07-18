package com.loops;

public class SwapElements {
	static int a = 10; 
	static int b = 50;

	public static void swap()
	{
		int temp; 

		temp = a;
		a = b;
		b = temp;	

		return;
	}

	public static void main(String[] s)
	{
		System.out.println("Before swapping");
		System.out.println("value a:" + a);
		System.out.println("value b:" + b);

		SwapElements.swap();

		System.out.println("\nAfter swapping");
		System.out.println("value a:" + a);
		System.out.println("value b:" + b);
	}	
}