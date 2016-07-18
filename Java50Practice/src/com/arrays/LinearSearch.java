package com.arrays;

public class LinearSearch {
    public static boolean find(int [] a, int n)
    {
    	for (int i = 0; i < a.length; i++)
    	{
    		if (a[i] == n)
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    public static void main(String [] args)
    {
    	int m [] = {10, 3, 4, 49, 48};
    	int n = 4;
    	
    	System.out.println(LinearSearch.find(m, n)); // returns true or false to println
    	System.out.println(LinearSearch.find(m, 50)); // returns true or false to println
    }
}
