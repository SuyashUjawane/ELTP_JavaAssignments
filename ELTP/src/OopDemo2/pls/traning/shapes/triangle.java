package OopDemo2.pls.traning.shapes;



public class triangle extends shape implements Sparkable,Rotatable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is triangle...");
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println(" Triangle is rotating "+Rotatable.DIRECTION+" direction....");
		
	}

	@Override
	public void sparkle() {
		// TODO Auto-generated method stub
		System.out.println(" Triangle is Sprking "+ Sparkable.DIRECTION+"....");
		
	}
	
}
   
