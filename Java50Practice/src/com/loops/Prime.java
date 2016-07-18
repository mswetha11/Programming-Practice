package com.loops;

public class Prime {	
	public static boolean isPrime(int n)
	{
		int i;

		for (i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				System.out.println("not prime ");
				return false;
				//break;
				//continue;
			}
		}
		
		System.out.println( "prime ");
		return true;
	}
	
	public static void main(String[] s)
	{	
		boolean answer = isPrime(9);
		System.out.println("answer is : " + answer);
	}
}
