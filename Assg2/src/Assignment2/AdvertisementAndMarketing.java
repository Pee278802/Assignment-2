package Assignment2;
import java.util.Scanner;
public abstract class AdvertisementAndMarketing {
	
	Scanner input = new Scanner(System.in);
	String method1, method2, method3, offlineAdvertisement, celebritySpokeman;
	double costOfAdvertisment;
	int Options;
	
	public void AdvertisementOptions(){
		System.out.println("\n---------------------Method of Advertisement---------------------\n1\t Online Advertisement\n2\t Offline Advertisment\n3\t Spokeman");
		System.out.println("Method: ");
		Options = input.nextInt();
		switch(Options) {
			case 1:
				System.out.println("Method 1 :" );
				method1();
				costOfAdvertisment = 10000;
				System.out.printf("Cost\t:RM%.2f", costOfAdvertisment);
			
			break;
			
			case 2:
				System.out.println("Method 2 :" );
				System.out.println(method2("Billboard"));
				costOfAdvertisment = 20000;
				System.out.printf("Cost\t:RM%.2f", costOfAdvertisment);
				
			break;
			
			case 3:
				System.out.println("Method 3 :" );
				System.out.println(method3("Vin Diesel", 1));
				System.out.println(method3("Kris Wu", 2));
				costOfAdvertisment = 652000;
				System.out.printf("Cost\t:RM%.2f", costOfAdvertisment);
			break;
				
		}
	}
	public String method1() {
		System.out.println("Online advertising: \n"+"Facebook \n"+ "Twitter \n"+"Youtube");
		return method1;
	}
	public String method2(String offlineAdvertisement) {
		return offlineAdvertisement;
	}
	public String method3(String celebritySpokeman, int Spokeman) {
		return Spokeman + ".\t" +celebritySpokeman;
	}
	public void printCostOfAdvertisment() {
		System.out.println("\n---------------------Method of Advertisement---------------------\n1\t Online Advertisement\n2\t Offline Advertisment\n3\t Spokeman");
		System.out.println("Method 1 :" );
		method1();
		costOfAdvertisment = 10000;
		System.out.printf("Cost\t:RM%.2f", costOfAdvertisment);
		
		System.out.println("\nMethod 2 :" );
		System.out.println(method2("Billboard"));
		costOfAdvertisment = 20000;
		System.out.printf("Cost\t:RM%.2f", costOfAdvertisment);
		
		System.out.println("\nMethod 3 :" );
		System.out.println(method3("Vin Diesel", 1));
		System.out.println(method3("Kris Wu", 2));
		costOfAdvertisment = 652000;
		System.out.printf("Cost\t:RM%.2f", costOfAdvertisment);
	
	}
}

