package Assignment1;
import java.util.Scanner;

public class assig1 {
		
	public static void main (String[] args)
	{	Scanner sc=new Scanner(System.in);		
		System.out.println("Enter size of array : ");		
		int n=sc.nextInt();		
		int []arr=new int[n];		
		System.out.println("Enter array element : ");		
		for (int i = 0; i < arr.length; i++) 
		{	arr[i]=sc.nextInt();
		}
		
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{	if(arr[i]%2==0)
			{	count++;
			}
		}		
		System.out.println("Count of even number is : "+count);
		sc.close();
	}
}
