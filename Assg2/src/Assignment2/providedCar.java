package Assignment2;

public class providedCar extends typeOfRacing{
	protected String [] providedCar = {"Alfa Romeo Ferrari C39", "Renault RS20 ", "Racing Point BWT Mercedes RP20" + "Williams Mercedes FW43"};
	protected String [] providedCar1 = {"Mazda MX-5", "Porsche 911", "Alpine A110", "Porsche 718 Boxster/Cayman", "McLaren 570S", "Mercedes-AMG C 63 S"};
	protected String [] providedCar2 = {"Declasse Burger Shot Stallion", "Bravado Redwood Gauntlet", "Vapid Pisswasser Dominator", "Bravado Sprunk Buffalo"};
	protected String [] providedCar3 = {"Chevrolet Camaro ZL1", "Buick Grand National GNX", "Chevrolet Corvette C7 Z06", "Mustang GT500", "Chevrolet Nova"};
	
	public void providedCar(){
		System.out.println("The provided car for " + typeOfRacing[0]);
		for(int i = 0; i < providedCar.length;i++) {
		System.out.println(" " +providedCar[i]);
		}
	}
	public void providedCar1(){	
		System.out.println();
		System.out.println("The provided car for " + typeOfRacing[1]);
		for(int i = 0; i < providedCar1.length;i++) {
		System.out.println(" " +providedCar1[i]);
		}
	}
	public void providedCar2(){
		System.out.println();
		System.out.println("The provided car for " + typeOfRacing[2]);
		for(int i = 0; i < providedCar2.length;i++) {
		System.out.println(" " +providedCar2[i]);
		}
	}
	public void providedCar3(){
		System.out.println();
		System.out.println("The provided car for " + typeOfRacing[3]);
		for(int i = 0; i < providedCar3.length;i++) {
		System.out.println(" " + providedCar3[i]);
		}
	}
}
