package Java;

public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile nokia;
		nokia = new Mobile();
		nokia.call();
		nokia.text();
		nokia.photocapture();
		//nokia.storage =10;
		nokia.type ="Android";
		nokia.size = 15;
		nokia.PrintDetails();
		nokia.PrintPrice(10);//Number of phones from Class
		/*Car Santro;
		Santro = new Car();
		Santro.Accelerator();
		Santro.Brake();
		Santro.Capacity();*/
		
		/*new Mobile().call();
		new Mobile().text();*/
	}
	

}
