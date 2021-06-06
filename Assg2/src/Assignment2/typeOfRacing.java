package Assignment2;

abstract class typeOfRacing{
	protected String [] typeOfRacing = {"Formula Racing", "Sports car racing", "Stock car racing", "Drag car racing"};

	public void typeOfRacing() {
		System.out.println("Types of car racing:");
		for(int i = 0; i < typeOfRacing.length; i++) {
			System.out.println(" " + typeOfRacing[i]);
		}
	}
}
