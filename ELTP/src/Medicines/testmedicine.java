package Medicines;
import java.util.Random;
public class testmedicine {
	public static void main(String[] args)
	{	medicine arr[]=new medicine[10];
		Random r=new Random();
		for (int i = 0; i < arr.length; i++) 
		{	int temp=r.nextInt(3);
			if(temp==0)
			{	arr[i]=new tablet("TabShop", "Dry Area Market", "Solid", "Kept in dry area");
			}
			else if(temp==1)
			{	arr[i]=new syrup("SyrupStore", "Center Market", "Liquid", "Kept in any area");
			}
			else 
			{	arr[i]=new ointment("OitnmentShop", "Outside Market", "Oil", "For external use");
			}
		}
		
		for (int i = 0; i < arr.length; i++) 
		{	System.out.println("---------------------------------------");
			arr[i].displayLab();
		}
	}

}
