package Assignment1;
import java.util.Scanner;
public class assig2 {
	
	public static void main (String[] args)
	{	Scanner sc=new Scanner(System.in);	
		System.out.println("Enter size of array : ");	
		int n=sc.nextInt();	
		int []arr=new int[n];
		System.out.println("Enter array element : ");
		for (int i = 0; i < arr.length; i++) 
		{	arr[i]=sc.nextInt();
		}
		System.out.println("Even and multiple of 5 elements of array : ");
		for (int i = 0; i < arr.length; i++)
		{	if(arr[i]%2==0 && arr[i]%5==0)
			{		System.out.print(arr[i]+" ");
			}
		}	
		sc.close();

	}

}

