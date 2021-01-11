package com.persistent.corejava;

import java.util.Scanner;

public class FindandReplace {
    public static void main (String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String sentence = sc.nextLine();
		System.out.println("Enter Source wrd:");
		String source = sc.nextLine();
		System.out.println("Wanna Replace With:");
		String target = sc.nextLine();
		
		String replaceString=sentence.replace(source,target);
		System.out.println(replaceString);  
	}
}
