package Assignment2;

import java.util.Scanner;

public class CarRacingMain {
	
	public static void main(String[] args) {
		String login;
		int adminOptions;
		
		Scanner input = new Scanner(System.in);	
		CarRacing RacingCarCompany = new CarRacing();
		RacingCarCompany.detailOfCompany("Pro MotorSport Enterprise", "Alor Setar, Kedah", "1.\tPossess a NATION COMPETITION LICENSE\n\t\t 2.\tGood Healt Situation", "12p.m.-10p.m. Everyday");
		RacingCarCompany.printDetail();

		do {
			System.out.println("\nAdmin / Customer: " );
			login = input.next();

			switch(login) {
				case "Admin":
				do {
				System.out.println("1\tEmployee Management\n2\tFinance\n3\tProvided Car\n0\tBack to the menu");
				System.out.print("Option:\t");
				adminOptions = input.nextInt();
				switch (adminOptions) {
					case 1:
						EmployeeManagement employee1 = new EmployeeManagement();
						employee1.EmployeeManagementSystem();
						break;
					case 2:
						Finance finance1 = new Finance(5000, 5627000, 18750, 8470400, 15000, 90000000, 500000, 8000000, 3);
						finance1.FinancialSatement();
						break;
					case 3:
						providedCar Car1 = new providedCar();
						Car1.providedCar();
						Car1.providedCar1();
						Car1.providedCar2();
						Car1.providedCar3();

					case 0:
						break;
					default:
						System.out.println("Invalid choice. Please Try again\n");
						break;
					}
				}while(adminOptions != 1 && adminOptions != 2 && adminOptions != 3 && adminOptions != 4 && adminOptions != 0);
					break;
				
				case "Customer":
					Customer client1 = new Customer();
					client1.Customer();
					break;
			} return;
		}while(adminOptions == 0);

	}
}