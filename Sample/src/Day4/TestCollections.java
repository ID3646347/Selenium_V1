package Day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******SEQUENCE*******");
		for(int i = 0; i<10; i++){
			System.out.println(i);
		}
		
		System.out.println("*******FIBANACCI*******");
		 int n1=0,n2=1,n3,j, counter = 10;    
		 System.out.println(n1);//printing 0 and 1   
		 System.out.println(n2);
		    
		 for(j=2;j<counter;j++){//loop starts from 2 because 0 and 1 are already printed    
		    
		  n3=n1+n2;    
		  System.out.println(n3);    
		  n1=n2;    
		  n2=n3;    
		 }  
		
		
		System.out.println("\n*******LIST*******");
		List<String> li = new ArrayList<>();
		li.add("amal");
		li.add("vijay");
		li.add("kishore");
		li.add("amal");
		
		for (int i =0; i<li.size();i++){
			System.out.println("The Value of i and li is = "  + li.get(i));
			
		}
		
		System.out.println("\n*******LIST IS HORIZONTAL*******");
		System.out.println(li);
		
		System.out.println("\n*******LIST USING ANOTHER METHOD*******");
		for(String name:li){
			System.out.println("The Value of i and li is = "  + name);
		}
		
		System.out.println("\n*******LIST and Append MR. infront of Name*******");
		for (int i =0; i<li.size();i++){
			li.set(i,"Mr. "+li.get(i));
			System.out.println("The Value of i and li is = "  + li.get(i));
		
		}
		
		System.out.println("\n*******SET*******");
		Set<String> set = new TreeSet<>();
		set.add("amal");
		set.add("vijay");
		set.add("kishore");
		set.add("amal");
		
		for(String name:set){
			System.out.println("The Value of i and set is = "  + name);
		}
		
		
		System.out.println("\n*******ITERATOR*******");
		Iterator<String> iterator = li.iterator();
		while(iterator.hasNext()){
			System.out.println("The Value of i using Iterator = " + iterator.next());
		}
		
		System.out.println("\n*******MAP*******");
		Map<Integer,String> map = new HashMap<>();
		map.put(0, "amal");
		map.put(1, "vijay");
		map.put(2, "kishore");
		map.put(3, "amal");
		
		for(int i=0;i<map.size();i++){
			System.out.println(i + " " + map.get(i));
		}
		
		/*System.out.println("\n*******TABLE*******");
		
		List<String> l = new Arraylist<String>();
		List<List<String>> l = new Arraylist<list<String>>();
		List<String> one = new Arraylist<>;
		one.add ("ID");
		one.add("EMPNAME");
		one.add("EMPLOCATION");*/
			
		
	}

}
