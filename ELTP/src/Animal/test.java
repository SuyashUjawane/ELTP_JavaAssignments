package Animal;

public class test {
	public static void main(String[] args) {
		
		animal a=new animal();
		a.show();		
		System.out.println("---------------------------");
		
		dog d=new dog("tommy", "black", "Bow Bow");
		d.show();		
		System.out.println("---------------------------");
		
		cat c=new cat("abc","white","myau myau");
		c.show();
		
		System.out.println("---------------------------");
		
		kitten k=new kitten("xyz", "blackAndWhite", "somekittensound");
		k.show();
		
		}
}
