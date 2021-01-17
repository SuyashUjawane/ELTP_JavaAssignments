package OopDemo2.pls.traning.canvas;

import OopDemo2.pls.traning.shapes.shape;
import OopDemo2.pls.traning.shapes.circle;
import OopDemo2.pls.traning.shapes.Sparkable;
import OopDemo2.pls.traning.shapes.Bouncable;
import OopDemo2.pls.traning.shapes.Rotatable;

public class GameConsole {
	public void drawShape(shape s)
	{
		s.draw();
		if(s instanceof circle)
		{
			((circle)s).fillColor("Red");		
		}
		
		if(s instanceof Sparkable){
			((Sparkable)s).sparkle();
		}
		if(s instanceof Bouncable){
			((Bouncable)s).bounce();
		}
		if(s instanceof Rotatable){
			((Rotatable)s).rotate();
		}
		
	}
	
}
