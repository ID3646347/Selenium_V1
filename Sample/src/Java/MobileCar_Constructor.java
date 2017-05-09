package Java;

public class MobileCar_Constructor {
	private int Storage, mSize, CSize, Engine, Capacity;
	String type, Model;
	
	MobileCar_Constructor(String type, int Storage, String Model, int mSize, int CSize, int Engine, int Capacity){
		this.type = type;
		this.Storage = Storage;
		this.mSize = mSize;
		
		if(CSize <= 0)
			this.CSize = 7;
		else
			this.CSize = CSize;
		
		this.Engine = Engine;
		this.Model = Model;

		
		
		/*if(gender=="Male" || gender=="Female")
			this.gender = gender;
		
		this.color = color;
		
		if (height <= 0) 
			this.height = 10;
		else
			this.height = height;*/
		
	}
	
	void printdetails(){
		System.out.println("Type: " + type);
		System.out.println("Stoarage: " + Storage);
		System.out.println("Model: " + Model);
		System.out.println("Engine: " + Engine);
		System.out.println("Capacity: " + Capacity);
		System.out.println("Car Size: " + CSize);
		System.out.println("Motor Size: " + mSize);
		
	}
}
