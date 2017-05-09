package Day3;

public class TestShape_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSquare sqr = new SSquare(10);
		
		
		/*S3D s3d = new S3D();
		SSquare ssquare = new SSquare();
		SCircle scircle = new SCircle();
		SCube scube = new SCube();
		SCone scone = new SCone();*/
		
		twod_constructor.length(10);
		System.out.println(twod_constructor.sarea(3));
		
		scircle.sarea();
		System.out.println(scircle.sarea(4));
		
		scube.sarea();
		System.out.println(scube.sarea(5));
		
		scube.svolume();
		System.out.println(scube.svolume(6));
		
		scone.sarea();
		System.out.println(scone.sarea(7,8));
		
		scone.svolume();
		System.out.println(scone.svolume(8,9));
	}

}
