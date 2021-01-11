package com.persistent.corejava;
import java.util.Scanner;
public class assig8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		
		char [][] arr={{'x','o','o'},{'x','o','x'},{'x','o','o'}};
		int xc=0,oc=0;
		
		//-------------for horizontal ---------------
		for (int i = 0; i < arr.length; i++) {
			xc=0;
			oc=0;
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j]=='x')
				{
					xc++;
				}
				
				if(arr[i][j]=='o')
				{
					oc++;
				}
				
				
			}
			if(xc==arr[i].length)
			{
				System.out.println("horizontally : x");
				break;
			}
			
			if(oc==arr[i].length)
			{
				System.out.println("horizontally : o");
				break;
			}
		}	
		
		
//--------------for daigonals-----------------------
		xc=0;oc=0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if(i==j)
				{
					if(arr[i][j]=='x')
					{
						xc++;
					}
					
					if(arr[i][j]=='o')
					{
						oc++;
					}
				}
				
				
			}
		}
			if(xc==arr.length)
			{
				System.out.println("daigonally : x");
				
			}
			
			if(oc==arr.length)
			{
				System.out.println("daigonally : o");
				
			}
			
			
	//-----------------for verticle ----------------------
			
			for (int i = 0; i < arr.length; i++) {
				xc=0;
				oc=0;
				for (int j = 0; j < arr[i].length; j++) {
					
					if(arr[j][i]=='x')
					{
						xc++;
					}
					
					if(arr[j][i]=='o')
					{
						oc++;
					}
					
					
				}
				if(xc==arr[i].length)
				{
					System.out.println("verticlly : x");
					break;
				}
				
				if(oc==arr[i].length)
				{
					System.out.println("verticlly : o");
					break;
				}
			}	
			
			
	//---------------------------------------------------------------
			
		}
}
