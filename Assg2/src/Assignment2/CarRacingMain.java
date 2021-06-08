package Assignment2;

import java.util.Scanner;
import java.io.IOException;

public class CarRacingMain {
	
	public static void main(String[] args) {
		Login();
	
	}
	
	public static void Login(){
		String login;
		int adminOptions;
		Scanner input = new Scanner(System.in);	
		System.out.println("=============== WELCOME TO THE PRO MOTORSPORT ENTERPRISE============");
		System.out.println("Name\t\t\t:Pro MotorSport Enterprise,\nLocation\t\t:Alor Setar, Kedah\nRequirement\t\t:1.\\tPossess a NATION COMPETITION LICENSE\\n\\t\\t 2.\\tGood Healt Situation,\nBusiness Hours\t\t:12p.m.-10p.m. Everyday");

		do {
			System.out.println("\nAdmin / Customer: " );
			login = input.next();
			
			switch(login) {
			case "Admin":
			do {
			System.out.println("\n\n1\tEmployee Management\n2\tFinance\n3\tProvided Car\n4\tBack To Login\n0\tExit");
			System.out.print("Option:\t");
			adminOptions = input.nextInt();
			switch (adminOptions) {

				case 1:
					EmployeeManagement employee1 = new EmployeeManagement();
					employee1.EmployeeManagementSystem();
					break;

				case 2:
					Finance finance1 = new Finance();
					finance1.setBusinessLicense(1000000);
					finance1.setSalary(200000);
					finance1.setMaintenance(300000);
					finance1.setPrize(100000);
					finance1.setInsurance(500000);
					finance1.setEntryFee(600000);
					finance1.setTicketFee(700000);
					finance1.setSponsorship(100000000);
					finance1.printInfo();
					break;
				case 3:
					providedCar Car1 = new providedCar();
					Car1.printInfo();
					break;
				case 4:
					Login();
					break;
				case 0:
					System.out.println("\n\n=== Have a  Good Days!===");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please Try again\n");
					break;
				}
			}while(adminOptions != 1 || adminOptions != 2 || adminOptions != 3 || adminOptions != 4 || adminOptions != 0);
				break;
			
			case "Customer":
				Customer client1 = new Customer();
				client1.printInfo();
				break;
				
		} return;
			
		}while(adminOptions == 0);
	}
}