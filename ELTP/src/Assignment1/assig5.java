package Assignment1;
import java.util.Scanner;
public class assig5 {
	
	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		int count=0;
		for (int i = 0; i < str.length(); i++)
		{	if(str.charAt(i)==' ')
			{	count++;
			}
		}
		
		System.out.println("Total Spaces in String are : "+count);
		
		sc.close();
	} 
}
