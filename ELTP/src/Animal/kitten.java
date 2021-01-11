package Animal;

public class kitten extends cat{
	
	public kitten(String name,String color, String sound)
	{	this.setName(name);
		this.setColor(color);
		this.setSound(sound);
	}
		
	@Override
	void show()
	{	System.out.println("I am kitten..");
		System.out.println("Name : "+this.getName());
		System.out.println("Color : "+this.getColor());
		System.out.println("Sound : "+this.getSound());
	}

}
