package com.persistent.corejava;

import java.util.Scanner;

public class language_fundamental {
    
	public static void main (String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers:");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		System.out.println(calMax(a,b,c));
		
		System.out.println("Enter a character :");
		char ch = sc.next().charAt(0);
		System.out.println(checkAlpha(ch));
		
		System.out.println("Enter Amount :");
		int amt = sc.nextInt();
		System.out.println("Interest: " +calInterest(amt));
		
		System.out.println("Enter GrossPay :");
		int gp = sc.nextInt();
		System.out.println("Interest:" +calTax(gp));
		
		System.out.println("Enter Number To Check Prime :");
		int num = sc.nextInt();
		System.out.println(isPrimeNumber(num));
		
		System.out.println("Enter MaxValue :");
		int maxVal = sc.nextInt();
		printPrime(maxVal);
		System.out.println("");
		
		System.out.println("Enter No. Of Attendee :");
		int numAttendees = sc.nextInt();
		System.out.println("Profit: "+ calculateProfit(numAttendees));
		
		System.out.println("Enter units : ");
		int e=sc.nextInt();
		System.out.println("Enter\n 1 for domestic connection \n 2 for commercial connection ");
		int f=sc.nextInt();
		System.out.println("Bill in Rs : "+calBill(e,f));
		
		System.out.println("Enter Charge Amount : ");
		int g =sc.nextInt();
		System.out.println("Pay back amount : Rs. "+calLoan(g));
		table();
	}
	
	static int calMax(int a, int b, int c) 
	{
			return Math.max(a, Math.max(b,c));
	}
	
	static boolean checkAlpha(char ch)
	{	if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
		{        return true;
	    }
		else
		{	     return false;
	    }
	}
	
	static double calInterest(int amt)
	{
		double r=0;
		if(amt<=1000)
		{	r=0.04;
		}
		if(amt>1000 && amt<=5000)
		{	r=0.045;
		}
		if(amt>5000)
		{	r=0.05;
		}
		double interest=r*amt;
		return interest;
	}
	
	static double calTax(int gp)
	{
		double tax=0;
		if (gp<=240)
		{	tax=0;
		}
		if (gp>240 && gp<=480)
		{	tax=0.15*gp; 
		}
		if (gp>480)
		{	tax=0.28*gp;
		}
		return tax;
	}
	
	static boolean isPrimeNumber( int num)
	{	int i=2;
		boolean flag = false;
		while(i<= num/2)
		{   if(num % i == 0)
		    { 	flag = true;
			    break;
		    }
		    i++;
		}
		if (!flag)
			return true;
		else
			return false;
	}
	
	static void printPrime(int maxVal)
	{	 int low = 2, high = maxVal;
	     while (low < high)
	     {      boolean flag = false;
	            for(int i = 2; i <= low/2; ++i)
	            {     if(low % i == 0) 
	            	  {     flag = true;
	                        break;
	                }
	            }
	            if (!flag && low != 0 && low != 1)
	                System.out.print(low + " ");

	            ++low;
	        }
	}
	
	static float calculateProfit( int numAttendees)
	{	int a =numAttendees;
		float profit = (float)((5*a)-(a*0.5+20));
		return profit;
	}
	
	static double calBill(int a,int b)
	{	if(b==1)
		{	if(a<=100)
			{	double bill= (a*4);
				if(bill<=250)
				{	return 250;
				}
				else
				{	return bill;
				}
			}
			else if(a>100 && a<=300)
			{		return (a*4.5);
			}
			else if(a>300 && a<=500)
			{		return (a*4.75);
			}
			else
			{		return (a*5);
			}
		}
		else
		{	if(a<=100)
			{	double bill= (a*4.25);
				if(bill<=350)
				{	return 350;
				}
				else
				{	return bill;
				}
			}
			else if(a>100 && a<=300)
			{		return (a*4.75);
			}
			else if(a>300 && a<=500)
			{		return (a*5);
			}
			else
			{		return (a*5.25);
			}
		}
	}
	static double calLoan(int charge)
	{
		double pay=0;
		if (charge<=500)
			pay=0.0025*charge;
		if (charge>500 && charge<=1500)
			pay=0.0025*500+0.0050*(charge-500); 
		if (charge>1500 && charge<=2500)
			pay=0.0025*500+0.0050*1000+0.0075*(charge-1500);
		if (charge>2500)
			pay=0.0025*500+0.0050*1000+0.0075*1000+0.01*(charge-2500);
		return pay;
	}
	
	static void table()
	{	final int TABLE_SIZE = 12;
		int[][] table = new int[TABLE_SIZE][TABLE_SIZE];
		for(int i = 0 ; i < table.length ; ++i)
		{      for(int j = 0 ; j < table[i].length ; ++j) 
			   {       table[i][j] = (i+1)*(j+1);
			   }
	    }
		System.out.print("      :");             
		for(int j = 1 ; j <= table[0].length ; ++j) 
		{     System.out.print((j<10 ? "   ": "  ") + j);
		}
		for(int i = 0 ; i < table.length ; ++i) 
		{    System.out.print("Row" + (i<9 ? "  ":" ") + (i+1) + ":");
		     for(int j = 0; j < table[i].length; ++j)
		     {    System.out.print((table[i][j] < 10 ? "   " : table[i][j] < 100 ? "  " : " ") + table[i][j]);
		     }
		     System.out.println();
		}
		
		
	}
}


