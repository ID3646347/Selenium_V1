package Java;

public class FruitPurchase {
	

	void FruiteExpense(int NoofApple, int NoofBanana, int AppleCost, int BananaCost){
		int TotalAppleCost = NoofApple * AppleCost;
		int TotalBananaCost = NoofBanana * BananaCost;
		int TotalCost = TotalAppleCost + TotalBananaCost;
		
		//System.out.println("Total Apple Cost = " + (NoofApple * AppleCost));
		//System.out.println("Total Banana Cost = " + (NoofBanana * BananaCost));
		//System.out.println("Total Cost = " + ((NoofApple * AppleCost)+ (NoofBanana * BananaCost)));
		
		System.out.println("Total Apple Cost = " + TotalAppleCost);
		System.out.println("Total Banana Cost = " + TotalBananaCost);
		System.out.println("Total Cost = " + TotalCost);
	}
}