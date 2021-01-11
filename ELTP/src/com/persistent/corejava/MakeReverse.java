package com.persistent.corejava;

import java.util.Scanner;

public class MakeReverse {
	public static void main (String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String sentence = sc.nextLine();
		System.out.println(makeReverse(sentence));
		
	}
	static String  makeReverse(String str)
	{ 	String[] words = str.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) 
		{		String word = words[i];
				String reverseWord = "";
				for (int j = word.length()-1; j >= 0; j--) 
				{	reverseWord = reverseWord + word.charAt(j);
				}		
				reverseString = reverseString + reverseWord + " ";
		}	
	 return reverseString;
		
	}
	
}
