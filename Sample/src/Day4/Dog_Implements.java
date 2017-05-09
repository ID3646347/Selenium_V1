package Day4;

public class Dog_Implements extends Carnivores implements Pet_Interface{
	void eat(){
		System.out.println("Dog is eating");
	}
	
	void Dogeat(){
		System.out.println("Dog is eating");
	}
	
	void Dogsleep(){
		System.out.println("Dog is sleeping");
	}
	
	public void Play(){
		System.out.println("Dog is playing in Pet animals");
	}
	
	public void Walk(){
		System.out.println("Dog is walking in Pet animals");
}
}
