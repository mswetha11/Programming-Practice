package com.arrays;

public class CommonNumber {
    public static int findCommon(int [] m, int [] n)
    {
    	for (int i = 0; i < m.length; i++)
    	{ // i = 0 m[0] = 10; i = 1 m[1] 11, 
    	    for (int j = 0; j < n.length; j++) // j = 0 n[0] 5 , j = 1 n[1] 45, j = 2 n[2] 80
    	    {
    	    	if (m[i] == n[j])
    	    	{
    	    		return m[i];
    	    	}
    	    }
    	}
    	
    	return -1;
    }
	
    public static void main(String [] args)
    {
    	int [] a = {10, 11, 23, 45, 90, 12};
    	int [] b = {5, 45, 80};
    	
    	// int common = findCommon(a, b);
    	System.out.println("common number is " + findCommon(a, b));
    }
}
