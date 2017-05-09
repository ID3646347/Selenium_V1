package Java;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int square = new Shape().area(10);
	int rectangle = new Shape().area(5,4);
	int TotalArea = square + rectangle;
	//System.out.println("Total Area = " + (square + rectangle));
	System.out.println("Total Area = " + TotalArea);
	}

}
