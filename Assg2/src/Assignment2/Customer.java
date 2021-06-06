package Assignment2;

import java.util.Scanner;

public class Customer extends CarRacing{
	
	Scanner input = new Scanner(System.in);	
	protected String name, email, typeOfRacing, payFee, Customer;
	protected long icNo, contactNo;
	
	public void Customer() {
		printDetailOfCompany();
		System.out.print("Contestant/Audience:\t");
		this.Customer = input.next();
		if (Customer == "Contestant" || Customer == "contestant") {
			System.out.println("-------------------REGISTRATION FORM-------------------");
			System.out.print("Enter name: ");
			this.name = input.next();
			System.out.print("IC no");
			this.icNo = input.nextLong();
			System.out.print("Enter your email: ");
			this.email = input.next();
			System.out.print("Enter contact no: ");
			this.contactNo = input.nextLong();
			System.out.println("Type of racing:");
			this.typeOfRacing = input.next();
			printDetail();
			printRegistration();
			
		}else 
			System.out.println("Audiance");
			System.out.println("registration fee = RM100.00");
			String payFee = input.next();
			if (payFee == "yes" || payFee == "Yes") {
				System.out.println("Purchased Successfully!");
			
			}else {
				System.out.println("Purchased Failed!");
			}
	}
	
	
	public void printDetail() {
		System.out.println("Name:\t" + this.name);
		System.out.println("IC no:\t" + this.icNo);
		System.out.println("Email:\t" + this.email);
		System.out.println("Contact No:\t" + this.contactNo);
		System.out.println("Type of racing\t:" + this.typeOfRacing);
	
	}
	public void printRegistration() {
		System.out.println("Registration Fee: \t RM75000.00");
		String payFee = input.next();
		if (payFee == "yes" || payFee == "Yes") {
			System.out.println("Registered Successfully!");
		
		}else {
			System.out.println("Registration Failed");
		}
	}
}
