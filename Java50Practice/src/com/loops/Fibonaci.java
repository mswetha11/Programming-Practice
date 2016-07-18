package com.loops;

public class Fibonaci {
	public static void printFibonaci(int n)
	{
		int i;
		int first = 0;
		int sec = 1;
		int next;

		System.out.print(first + " ");
		System.out.print(sec + " ");

		for( i = 2; i < n; i++)
		{
			next = first + sec;  
			System.out.print(next + " ");
			first = sec;
			sec = next;            
		}
	}

	public static void main(String[] args)
	{
		int n = 20;
		printFibonaci(20);	
		printFibonaci(n);
	}
}
