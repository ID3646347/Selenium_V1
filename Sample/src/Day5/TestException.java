package Day5;

import java.util.ArrayList;
import java.util.List;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n*******LIST*******");
		List<String> li = new ArrayList<>();
		li.add("amal");
		li.add("vijay");
		li.add("kishore");
		li.add("amal");
		
		System.out.println("******EXCEPTION**********");
		try
		{
			for(int i=0;i<=li.size();i++)
			{
				li.set(i, "Mr. "+li.get(i));
				System.out.println("The Value of i and li is = "  + li.get(i));
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Array Index might be out of bounds");
		}
		catch(Exception d)
		{
			System.out.println("Error Throwings");
		}
		
		//new FileOutputStream("");
			
		

	}

}
