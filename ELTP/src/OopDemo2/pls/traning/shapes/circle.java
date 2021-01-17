package OopDemo2.pls.traning.shapes;

public class circle extends shape implements Bouncable {
	
	public void draw()
	{
		System.out.println("This is circle...");
	}
	
	public void fillColor(String color){
		System.out.println(" Filling Circle with "+color +" color");
	}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println(" Circle is Bouncing....");
	}
}
