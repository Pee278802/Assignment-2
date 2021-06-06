package Assignment2;

public abstract class CarRacing extends typeOfRacing{
	protected String name, location, businessHours, requirement;
	
	public void detailOfCompany(String name, String location, String requirement, String businessHours) {
		this.name = name;
		this.location = location;
		this.businessHours = businessHours;
		this.requirement = requirement;
		
	}
	
	public void printDetailOfCompany() {
		System.out.println("-----------ABOUT US-------------");
		System.out.println("Name\t\t:" + this.name);
		System.out.println("Location\t:" + this.location);
		System.out.println("Requirement\t:" + this.requirement);
		System.out.println("Business Hours\t:" + this.businessHours);
		typeOfRacing();

	}
	
	public void printDetail() {
		printDetailOfCompany();
	}
}
