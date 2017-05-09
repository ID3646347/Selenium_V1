package Java;

public class Duck {

	//String gender, color;
	//int height;
	
	private int height;
	private String gender, color;
	
	
	int getHeight(){
		return height;
	}
	
	void setHeight(int height){
		
		//this.height = height;
		
		if (height <= 0) 
			this.height = 10;
		else
			this.height = height;
		}
	
	String getGender(){
		return gender;
	}
	
	void setGender(String gender){
		if(gender=="Male" || gender=="Female")
			this.gender = gender;
	}
	
	String getColor(){
		return color;
	}
	
	void setColor(String color){
		this.color = color;
	}
	
	
	void printdetails(){
		System.out.println("Gender: " + gender);
		System.out.println("Color: " + color);
		System.out.println("Height: " + height);
		
	}
	
}
