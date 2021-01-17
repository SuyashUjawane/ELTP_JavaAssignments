package OopDemo2.pls.traning.shapes;

public class Star extends shape implements Sparkable  {

	@Override
	public void draw() {
		System.out.println(" Drawing A Star....");
	}
	
	@Override
	public void sparkle() {
		// TODO Auto-generated method stub
		System.out.println(" Star is Sparkling "+DIRECTION);	
	}

}
