package OopDemo2;

import OopDemo2.pls.traning.canvas.GameConsole;
import OopDemo2.pls.traning.shapes.circle;
import OopDemo2.pls.traning.shapes.square;
import OopDemo2.pls.traning.shapes.triangle;
import OopDemo2.pls.traning.shapes.Star;
import OopDemo2.pls.traning.shapes.shape;

public class test {
public static void main(String[] args) {
		
		GameConsole console=new GameConsole();		
		/*g.drawShape(new circle()); 		
		g.drawShape(new triangle());
		g.drawShape(new square());
		
		
		console.drawShape(new Circle());
		console.drawShape(new Triangle());
		Shape s=new Square();		
		console.drawShape(s);*/
		
				
		shape shape2=new circle();
		shape shape3=new triangle();
		shape shape4=new square();

			
		console.drawShape(shape2);
		console.drawShape(shape3);
		console.drawShape(shape4);
		console.drawShape(new Star());
		
		
	}
}
