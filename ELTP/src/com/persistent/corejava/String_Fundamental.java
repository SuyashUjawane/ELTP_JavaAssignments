package com.persistent.corejava;

import java.util.Scanner;

public class String_Fundamental {
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String sentence = sc.nextLine();
		System.out.println("Enter Word:");
		String word = sc.nextLine();
		System.out.println(check(sentence,word));
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		int [] myArray = new int[5];
	    System.out.println("Enter 5 elements of the array:");
        for(int i=0; i<5; i++ ) 
        {       myArray[i] = sc.nextInt();
	    }
        System.out.println("Position : " + findPosition(num,myArray));
	}
	
	static int check(String str, String word)  
	{    String a[] = str.split(" "); 
	     int count = 0; 
	     for (int i = 0; i < a.length; i++)  
	     { 	 if (word.equals(a[i])) 
	    	 count++; 
	     } 
	     return count; 
	} 
	
	static int findPosition(int t,int[] my_array)
	{	int len= my_array.length;
		int i = 0;
		while (i < len)
		{     if (my_array[i] == t) return i;
        	  else i=i+1;
        }
		return -1;
    } 
	
}
