package Assignment2;

class Finance extends AdvertisementAndMarketing implements Payment{  //Inheritance

	protected double businessLicense, salary, Insurance, maintenance, prize;
	protected double entryFee , ticketFee, Sponsorship;
	protected int advertisementOptions; 
	
	public void setBusinessLicense(double businessLicense) {		//Encapsulation
		this.businessLicense = businessLicense;
	}
	public void setSalary(double salary) {		//Encapsulation
		this.salary = salary;
	}
	public void setInsurance(double insurance) {		//Encapsulation
		this.Insurance = insurance;
	}
	public void setMaintenance(double maintenance) {		//Encapsulation
		this.maintenance = maintenance;
	}
	public void setPrize(double prize) {		//Encapsulation
		this.prize = prize;
	}
	public void setEntryFee(double entryFee) {		//Encapsulation
		this.entryFee = entryFee;	
	}
	public void setTicketFee(double ticketFee) {		//Encapsulation
		this.ticketFee = ticketFee;
	}
	public void setSponsorship(double Sponsorship) {		//Encapsulation
		this.Sponsorship = Sponsorship;
	}

	public double getBusinessLicense() {		//Encapsulation
		return businessLicense;
	}
	public double getSalary() {			//Encapsulation
		return salary;
	}
	public double getInsurance() {			//Encapsulation
		return Insurance;
	}
	public double getMaintenance() {		//Encapsulation
		return maintenance;
	}
	public double getPrize() {				//Encapsulation
		return prize;
	}
	public double getEntryFee() {			//Encapsulation
		return entryFee;
	}
	public double getTicketFee() {			//Encapsulation
		return ticketFee;
	}
	public double getSponsorShip() {		//Encapsulation
		return Sponsorship;
	}

	public double totalExpense() { 
		return businessLicense + Insurance + salary + costOfAdvertisment + maintenance + prize;
	}
	
	public double totalRevenue() {
		return entryFee + ticketFee + Sponsorship;
	}
	
	public double totalNetIncome() {
		return totalRevenue() - totalExpense();
	}
	
	public double getPayment() {		//Interface
		return this.ticketFee + this.entryFee;	
	}
	
	public void printInfo() {		//Polymorphism
		System.out.println("\n-----------------------FINANCIAL STATEMENT---------------------");
		AdvertisementOptions();
		System.out.println("\n\n1. \t Revenue");
		System.out.printf("%-30s: RM%.2f%n", "Entry Fee:", entryFee);
		System.out.printf("%-30s: RM%.2f%n", "Ticket Fee:", ticketFee);
		System.out.printf("%-30s: RM%.2f%n", "Total Sponsorship", Sponsorship);
		System.out.printf("%-30s: RM%.2f%n", "Total Revenue", totalRevenue());
		System.out.println();
		System.out.println("2. \t Expenses");
		System.out.printf("%-30s: RM%.2f%n", "Total Expense", totalExpense());
		System.out.printf("%-30s: RM%.2f%n", "businessLisense", businessLicense);
		System.out.printf("%-30s: RM%.2f%n", "Insurance", Insurance);
		System.out.printf("%-30s: RM%.2f%n", "Salary", salary);
		System.out.printf("%-30s: RM%.2f%n", "Advertisement And Marketing", costOfAdvertisment);
		System.out.printf("%-30s: RM%.2f%n", "Total Expenses", totalExpense());
		System.out.println();
		System.out.println("3. \t Net Income");
		System.out.printf("%-30s: RM%.2f%n", "Total Net Income", totalNetIncome());
	}
}
