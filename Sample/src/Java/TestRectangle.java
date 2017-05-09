package Java;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Rectangle rsqa;
		rsqa = new Rectangle();
		rsqa.MyRectangle(10,5);
		
		Square osqa;
		osqa = new Square();
		osqa.Mysquare(10);*/
		
		int totalArea;
		int sarea;
		int rarea;
		sarea = new Square().Mysquare(10);
		rarea= new Rectangle().MyRectangle(10, 5);
		totalArea = sarea+rarea;
		System.out.println("Toatl area" + totalArea);
		
		
		
		//int oarea = sqa.Mysquare(10);
		//System.out.println(oarea);

	}

}
