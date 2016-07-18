package com.loops;

public class SwapElementWithoutThirdVariable {
	
	 public static void main(String[] s)
	 {
		int a = 10;
		int b = 50;
		
		System.out.println("Before swapping");
		System.out.println("value a:" + a);
		System.out.println("value b:" + b);
		
		a = a + b; // a = 10 + 50 i.e. 60
		b = a - b; // b = 60 - 50 i.e. 10 
		a = a - b; // a = 60 - 10 i.e. 50
		
		System.out.println("\nAfter swapping");
		System.out.println("value a:" + a);
		System.out.println("value b:" + b);
	 }
}
