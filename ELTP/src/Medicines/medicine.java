package Medicines;

public class medicine {
	private String name;
	private String address;
	
	public String getName() 
	{	return name;
	}
	
	public void setName(String name)
	{	this.name = name;		
	}
	
	public String getAddress()
	{	return address;
	}

	public void setAddress(String address)
	{	this.address = address;
	}
	
	public medicine()
	{	 super();
	}
	
	public medicine (String name, String address)
	{	super();
		this.name = name;
		this.address = address;
	}
	
	void displayLab()
	{	System.out.println("Details of Medicine : ");
		System.out.println("------------------");
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.address);
	}
	
}
