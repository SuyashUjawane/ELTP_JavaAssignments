package com.persistent.corejava;

import java.util.Scanner;

public class PermutationofString {
	// static int count=0;
    public static void main(String[] args)
    {	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String : ");
    	String str=sc.nextLine();
    	StringPermutation(str);
    }
    public static void StringPermutation(String input)
    {  	System.out.println("All possible combination of string are : ");
    	StringPermutation("",input);
    }

    public static void StringPermutation(String permutation,String input)
    {  	if(input.length()==0)
    	{		System.out.println(permutation);
    	}
    	else
    	{ 		for(int i=0;i<input.length();i++)
    		{		StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
    		}
    	}
    }
}
