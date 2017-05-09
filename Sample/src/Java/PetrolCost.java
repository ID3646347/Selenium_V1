package Java;

public class PetrolCost {
	
	

	void TripExpense(){
		
		int NoofCars = 7;
		int Carmileage = 15;
		int Distance = 1500;
		int FuelCost = 70;
		int NoofBikes = 5;
		int Bikemileage = 50;
		int Carpetrolcost = (Distance/Carmileage) * NoofCars * FuelCost;
		int BikePetrolCost = (Distance/Bikemileage) * NoofBikes * FuelCost;
	
		System.out.println("Petrol Cost for Cars = " + Carpetrolcost);
		System.out.println("Petrol Cost for Bikes = " + BikePetrolCost);
		System.out.println("Toal Petrol Cost = " + (Carpetrolcost + BikePetrolCost));
		
	}

}
