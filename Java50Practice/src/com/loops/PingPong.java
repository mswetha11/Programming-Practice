package com.loops;

public class PingPong {
	public static void ping(int n)
	{
		if (n % 3 == 0) 
		{
			if (n % 5 == 0)
			{
				System.out.println("ping pong"); 
			}
			else
			{
				System.out.println("ping"); 
			}
		}
		else 
		{
			if (n % 5 == 0) 
			{
			    System.out.println("pong"); 
			} 
			else 
			{
				System.out.println(n); 
			}
		}
		return;
	}	

	public static void main(String [] s)
	{
		PingPong.ping(6);
	}
}
