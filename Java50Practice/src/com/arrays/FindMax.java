package com.arrays;

public class FindMax {
	public static int max(int [] n){
	
		int i;
		int temp = n[0];

		for(i = 1; i < n.length; i++)
		{
			if(temp < n[i] )
			{
				temp = n[i];
			}
		}
		return temp;


	}

	public static void main(String args[])
	{
		int[] a =  {34, 50, 32, 28, 78, 10};

		int answer = FindMax.max(a);
		System.out.println(answer);
	}
}
