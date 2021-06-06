package Assignment2;

import java.util.Scanner;

public class EmployeeManagement extends CarRacing{
	Scanner input = new Scanner(System.in);
	protected String employeeName, email, position, username, password, newPassword, comfirmPassword;
	protected int age, TAC, option;
	protected long contactNo, IC;
	protected double salary;
	protected String confirmPassword;
	
	public void EmployeeManagementSystem() {
		printDetailOfCompany();
		System.out.println("-----------------EMPLOYEE MANAGEMENT SYSTEM---------------------");
		System.out.println("Option 1\t\t" + ":Add New Employee");
		System.out.println("Option 2\t\t" + ":Employee Login");
		System.out.println("Option 3\t\t" + ":Forgot Password");
		System.out.println("Option 4\t\t" + ":Delete Employee");
		System.out.print("Select Option\t\t:");
		option = input.nextInt();
		switch (option) {
			case 1:
				AddEmployee();
				printDetail();
				break;
			
			case 2:
				Login();
				break;
			
			case 3:
				forgetPassword(13579);
				break;
				
			case 4:
				deleteEmployee();
		}
	//a.AddEmployee();
	//a.printDetail();
	//a.forgetPassword(13579);
	//a.deleteEmployee();
	
	}
		public void AddEmployee() {
			printDetailOfCompany();
			System.out.println("-------------------Add Employee---------------");
			System.out.print("Enter the name: ");
			this.employeeName = input.next();
			System.out.print("Enter age: ");
			this.age = input.nextInt();
			System.out.print("Enter contact no: ");
			this.contactNo = input.nextLong();
			System.out.print("Enter position: ");
			this.position = input.next();
			System.out.print("Enter salary: ");
			this.salary = input.nextDouble();
		System.out.println("The new employee has been successfully added. ");
		return;
		}
		public void Login() {
			printDetailOfCompany();
			System.out.println("-------------------Employee Login---------------");
			System.out.print("Username\t\t:");
			this.username = input.next();
			System.out.print("Password\t\t:");
			this.password = input.next();
				if(this.username.equals(username) && password.equals(password)) {
					System.out.println("Login Successful.");
				}else{
					System.out.println("Please try again.");
				}
		}
		public void printDetail() {
			System.out.format(" Name " + "\t\t :" + this.employeeName + "\n Age " + "\t\t :" + this.age + "\n Contact No " + "\t :" + this.contactNo + "\n Possition " + "\t :" + this.position + "\n Salary " + "\t :%.2f\"", this.salary);
		}	
		public void forgetPassword(int TAC) {
			System.out.println("\n------------Reset Your Password------------");			
			System.out.print("TAC \t: ");
			this.TAC = input.nextInt();
				if (this.TAC == TAC) {
					do {
						System.out.print("Enter a new password: \t");
						this.newPassword = input.next();
						System.out.print("Comfirm password: \t");
						this.confirmPassword = input.next();
						if (this.confirmPassword.equals(newPassword) && this.newPassword.equals(confirmPassword)) {
							System.out.println("New password has been updated");
						} else {
							System.out.println("Inconsistent passwords. Please try again!");
						}
					}while(!(this.confirmPassword.equals(newPassword) && this.newPassword.equals(confirmPassword)));
				
				
				}else 
					do{
						System.out.println("The TAC is incorrect, please try again!");
						System.out.print("TAC \t: ");
						this.TAC = input.nextInt();
						if(this.TAC == TAC) {
							System.out.print("Enter a new password: \t");
							this.newPassword = input.next();
							System.out.print("Comfirm password: \t");
							this.confirmPassword = input.next();
						
							if (this.confirmPassword.equals(newPassword) && this.newPassword.equals(confirmPassword)) {
								System.out.println("New password has been updated");
							} else
								System.out.println("Inconsistent passwords. Please try again!");
						} 
					}while(this.TAC != TAC);
		}
		public void deleteEmployee() {
			System.out.println("-------------------Delete Employee---------------");
			System.out.print("Enter the name: ");
			this.employeeName = input.next();
			System.out.print("Enter age: ");
			this.age = input.nextInt();
			System.out.print("Enter contact no: ");
			this.contactNo = input.nextLong();
			System.out.print("Enter position: ");
			this.position = input.next();
			System.out.print("Enter salary: ");
			this.salary = input.nextDouble();
			
			printDetail();
			
			System.out.println("\nThe employee has been deleted.");
			
		}
}
