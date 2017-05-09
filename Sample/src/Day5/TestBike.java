package Day5;

public class TestBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Before Change");
		System.out.println(new Bike().noofwheels);
		
		Bike bike = new Bike();
		bike.name = "Bike";
		//bike.noofwheels =1;
		System.out.println("Immediatly after Change");
		System.out.println("after Change");
		
		System.out.println(new Bike().noofwheels);
		System.out.println(new Bike().noofwheels);
		System.out.println(new Bike().noofwheels);
		
		System.out.println(Bike.noofwheels);
	
		
	}

}
