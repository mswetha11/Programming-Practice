package com.loops;

public class PingPong {
	
	public static void ping(int n)
	{
		if (n % 3 == 0) // <+++++++++++++++15 <***********9
		{
			if (n % 5 == 0) // <++++++++++++++++
			{
				System.out.println("ping pong"); // <++++++++++++++15>
			}
			else
			{
				System.out.println("ping"); // <**************9
			}
			System.out.println("asokt"); // <++++++++++++++++++++15  <********************9
		}
		else // <-------------- 10 ####################17
		{
			if (n % 5 == 0) // <------------------------10 
			{
			    System.out.println("pong"); // <-----------------10
			} 
			else 
			{
				System.out.println(n); // <#######################17
			}
			System.out.println("moddu"); // <---------------------------------10 ##########17
		}
		System.out.println("double moddu"); // <++++++++++++++++++++++15 <-------------10 <*****************9 #################17
		return;
	}
	
	public static void ping2(int n)
	{
		boolean d3, d5; // declare variable divisible by 3 as d3
		String str = "swetha";
		
		d3 = d5 = false; // initialize d3 as false
		
		if (n % 3 == 0) //  <+++++15 <****9 <####17
		{
			d3 = true;	// <++++15 <***9
		}
		
		// System.out.println("asihfi");
		if (n % 5 == 0) // <+++++15 <====5 <****9 <###17
		{
			d5 = true; // <++++15 <===5
		}
		
		if (d3 && d5) // <+++++15 <===5 <***9 <###17
		{
			System.out.println("ping pong"); // <+++++++++++++++=15
		} 
		else if (d3) // <====5 <****9 <####17
		{
			System.out.println("ping"); // <****9
		} 
		else if (d5) // <===5 <####17
		{
			System.out.println("pong"); // <===5
			if (str.equals("swetha")) 
			{
			    System.out.println("moddu");	
			} 
			else 
			{
				System.out.println("double moddu");
			}
		}
		else // <#####17
		{
			System.out.println(n); // <####17
		}
	} // <++++++++++++++++++++15 <===5 <***9 <####17

	public static void main(String [] s)
	{
		PingPong.ping(5);
		
		//System.out.println(10000/4);
		//System.out.println(10000 >> 2); 
		// (x >> 1) == x/2 (>> right shift operator, computationally cheaper than division operator)
		// (x >> 2) == x/4 
		// (x >> 3) == x/8
		// (x >> n) == x/2^n
		
		//System.out.println(10000 * 4);
		//System.out.println(10000 << 2); 
		
		// (x << 1) == x * 2 (<< left shift operator, computationally cheaper than multiplication operator)
		// (x << 2) == x * 4
		// (x << 3) == x * 8
		// (x << n) == x * 2^n	
	}

}
