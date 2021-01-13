package Medicines;

public class tablet extends medicine{
	
	private String material;
	private String discription;
	
	public String getMaterial()
	{	return material;
	}
	
	public void setMaterial(String material)
	{	this.material = material;
	}
	
	public String getDiscription()
	{	return discription;
	}
	
	public void setDiscription(String discription) 
	{	this.discription = discription;
	}
	
	public tablet() 
	{	super();		
	}
	
	public tablet(String name,String address,String material, String discription)
	{	super();
		this.setName(name);
		this.setAddress(address);
		this.material = material;
		this.discription = discription;
	}
	
	@Override
	void displayLab()
	{	System.out.println("Details of tablet : ");
		System.out.println("------------------");
		System.out.println("Name : "+this.getName());
		System.out.println("Address : "+this.getAddress());
		System.out.println("Discription of tablet : "+this.discription);
		System.out.println("Material : "+this.material);
	}
}
