package Day4;

import java.io.FileNotFoundException;


public class TestAnimal {

	//public static void main(String[] args) throws FileNotFoundException{
		
	public static void main(String[] args){
		// TODO Auto-generated method stub
		/*Tiger tiger = new Tiger();
		Goat goat = new Goat();
		Herbivores herbivores = new Herbivores();
		
		tiger.Tigereat();
		tiger.Tigersleep();
		tiger.eat();
		tiger.sleep();
		
		goat.Goateat();
		goat.Goatsleep();
		goat.eat();
		goat.sleep();
		goat.Herbivoreseat();
		goat.Herbivoressleep();
		
		herbivores.Herbivoreseat();
		herbivores.Herbivoressleep();
		herbivores.eat();
		herbivores.sleep();*/
		
		Animal  a = new Animal();
		a.eat();
		a = new Tiger();
		a.eat();
		a = new Goat();
		a.eat();
		a = new Deer();
		a.eat();
		
		Tiger b = new Tiger();
		b.Tigereat();
		
		Goat_Implements goat_imp = new Goat_Implements();
		goat_imp.Play();
		goat_imp.Walk();
		goat_imp.eat();	
		goat_imp.sleep();
		
		Dog_Implements dog_imp = new Dog_Implements();
		dog_imp.Play();
		dog_imp.Walk();
		dog_imp.eat();	
		dog_imp.sleep();
		
	}

}
