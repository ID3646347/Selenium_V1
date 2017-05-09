package Java;

public class Mobile {
	
	int storage;
	String type;
	int size;
	
	void call(){
		System.out.println("Making a Call");
	}
	
	void text(){
		System.out.println("send Text Messages");
	}
	
	void photocapture(){
		System.out.println("Take Picture");
	}
	
	void PrintDetails(){
		System.out.println("Storage = " +storage);
		System.out.println("Type = " +type);
		System.out.println("Size = " +size);
	}
	
	void PrintPrice(int NoofPhones){
		int TotalCost;
		TotalCost = NoofPhones * 10000;
		System.out.println("Total Cost = " + TotalCost);
	}

}
