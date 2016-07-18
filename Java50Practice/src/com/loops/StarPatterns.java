package com.loops;

public class StarPatterns {	
	public static void main(String[] args) 
	{
		int i, j;

		for (i = 1; i <= 6; i++) // i = 1, 2, 3, 4, 5 6
		{
			for (j = 1; j < i; j++) // j = 1 to i-1 i.e. initial j = 1, check j < i true ? 
				//{
				System.out.print("*");
			//}
			System.out.println();
		}
	}
}