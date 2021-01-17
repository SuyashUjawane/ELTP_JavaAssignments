package exption_handling;

public class ContactTest {
	public static void main(String[] args) {
		Contact c = new Contact();
	/*	Contact c1 = new Contact();
		Contact c2 = new Contact();
		Contact c3 = new Contact();
		Contact c4 = new Contact();
		Contact c5 = new Contact(); */
		ArrayStack as = new ArrayStack(5);
		Contact cn;
		
		c.setFirstName("Suyash");
		c.setLastName("Ujawane");
		c.setDob("11011998");
		c.setTelephoneNo("9786548912");
		c.setEmail("rahulgautam@gmail.com");
		 try {
			int flag = c.validate();
			if(flag ==0) {
				System.out.println("Invalid contact object");				
			}
			else {
				as.push(c);
			}
			/* as.push(c1);
			 as.push(c2);
			 as.push(c3);
			 as.push(c4);
			 as.push(c5);
			 as.push(c);*/
			 cn = as.pop();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	}
}
