package com.arrays;

public class MissingNumber {
    public static int findMissing(int [] n)
    {    	
    	for (int i = 1; i < n.length; i++)
    	{
           //  if (n[1] != (n[0] + 1)) // if (n[2] != (n[1] + 1)) // if (n[3] != (n[2] + 1))
            if (n[i] != (n[i-1]) + 1)
            {
            	return n[i-1] + 1;
            }
    	}
    	
    	return -1;
    }
    
    public static void main(String args[])
    {
    	int [] a = {10, 11, 13, 14, 15};
    	int [] a1 = {10, 11, 12, 13, 14, 15};
    	
    	int missing = MissingNumber.findMissing(a);
    	System.out.println("missing number in array a is " + missing);
    	
    	System.out.println("missing number in array a1 is " + MissingNumber.findMissing(a1));    	
    }
    
}
