package Assignment2;

import java.util.Scanner;

public class Customer extends CarRacing implements Payment{	//Inheritance
	
	Scanner input = new Scanner(System.in);	
	protected String name, email, typeOfRacing, Customer;
	protected long icNo, contactNo;
	protected double payment, totalExchange;
	
	public Customer() {
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
			printInfo();
			printRegistration();
			
		}else 
			System.out.println("Audiance");
			System.out.println("registration fee = RM100.00");
			System.out.print("Yes / No : ");
			String payFee = input.next();
			if (payFee == "yes" || payFee == "Yes") {
				System.out.println("Purchased Successfully!");
			
			}else if(payFee == "No" || payFee == "no"){
				System.out.println("Purchased Failed!");
			}
	}
	
	
	public void printInfo() {	//Polymorphism
		System.out.println("Name:\t" + this.name);
		System.out.println("IC no:\t" + this.icNo);
		System.out.println("Email:\t" + this.email);
		System.out.println("Contact No:\t" + this.contactNo);
		System.out.println("Type of racing\t:" + this.typeOfRacing);
		
	
	}
	public void printRegistration() {
		System.out.println("Registration Fee: \t RM75000.00");		
			while(payment < 750000) {
				System.out.println();
				System.out.println("The Money Is Not Enough To Pay The Payment, Please Re-Enter Again!");
				System.out.print("Customer Paid		: 	RM");
				payment = input.nextDouble();
			}
			totalExchange = payment - 75000;
			System.out.format("Total Money Exchange 	:	RM%.2f",totalExchange);
			System.out.println();
			System.out.println("Registered Successfully!");
		}
	public double getPayment(){		//Interface
		return 750000;
		
	}
}
