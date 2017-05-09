package Java;

public class TestDuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Duck duck = new Duck();
			//duck.color = "White";
			//duck.gender = "Female";
			duck.setHeight(0);
			duck.setColor("white");
			duck.setGender("Male");
			
			duck.printdetails();
			
			
			System.out.println();
			duck.setHeight(15);
			duck.printdetails();

			System.out.println("\nDuck Height from getter = " + duck.getHeight());
			System.out.println("Duck Gender from getter = " + duck.getGender());
	}

}
