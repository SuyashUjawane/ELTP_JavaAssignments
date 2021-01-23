package Inventory_System;

public class CustomerTest {
	public static void main(String[] args) {
		Customer a = new Customer(101,"Suyash");
		a.setPrintingAddress("Street A","Bhilai","CG", "490009");
		a.setPhoneNumbers("9179106125", "7894561237","9685741283");
		//a.print();
		a.printPhoneNumbers();
		a.printShippingAddress();
	}
}
