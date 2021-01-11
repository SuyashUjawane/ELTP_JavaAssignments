package Animal;

public class dog extends animal {
	
	private String sound;

	public String getSound() 
	{	return sound;
	}

	public void setSound(String sound) 
	{	this.sound = sound;
	}
	
	public dog()
	{		super();
	}
	
	public dog(String name,String color,String sound)
	{	super();
		this.sound = sound;
		this.setName(name);
		this.setColor(color);
	}
	
	@Override
	void show()
	{	System.out.println("I am dog..");
		System.out.println("Name : "+this.getName());
		System.out.println("Color : "+this.getColor());
		System.out.println("Sound : "+this.sound);
	}
}
