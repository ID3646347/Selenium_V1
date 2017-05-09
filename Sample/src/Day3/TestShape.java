package Day3;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SShape sshape = new SShape();
		S2D s2d = new S2D();
		S3D s3d = new S3D();
		SSquare ssquare = new SSquare();
		SCircle scircle = new SCircle();
		SCube scube = new SCube();
		SCone scone = new SCone();
		
		ssquare.sarea();
		System.out.println(ssquare.sarea(3));
		
		scircle.cirarea();
		System.out.println(scircle.cirarea(4));
		
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
