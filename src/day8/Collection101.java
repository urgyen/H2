package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Collection101 {

	
	//Collection Framework
		//ArrayList
		//HashSet
		//HashMap
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList
		
		//int[] arrayname= new int[10];
		//arrayname[1]=assa;
		
		
//		ArrayList<String>  list = new ArrayList<>();
//		list.add("Urgyen");
//		list.add("Adars");
//		list.add("Abash");
//		list.add("Pratikshya");
//		
//		System.out.println(list);
//		
//		list.set(1, "Adarsh");
//		System.out.println(list);
//		
//		list.add(1, "John");
//		System.out.println(list);
//		
//		list.remove(0);
//		System.out.println(list);
//		
//		//AraayList is not for manipulation of data
//		//Indexing ko basis
//		
//		list.isEmpty();
	
		
		//insertion maintaion hudaina
		//unique value matra halna
//		HashSet<String> set1= new HashSet<>();
//		set1.add("John");
//		set1.add("Alan");
//		set1.add("Bob");
//		set1.add("MArk");
//	
//		System.out.println(set1);
//		
//	
		
		
	//	HashMap  === dictionary
		//Scenario
			//101	-- Adarsh
			//102	== Nisha
			//103	== Pratiskhya
			//104	== Abash
		
		HashMap<Integer, String> map1= new HashMap<>();
		
		
		map1.put(101, "Adarsh");
		map1.put(102, "Nisha");
		map1.put(103, "Pratikshya");
		map1.put(104, "Abash");
		map1.put(105, "Abash");
		
		//System.out.println(map1);
		
		//System.out.println(map1.keySet()

//		for( int data   : map1.keySet()) {
//			System.out.println(map1.get(data));
//			
//		}
		
		System.out.println(map1.entrySet());
		
		System.out.println("------");
		
		for(Map.Entry m:    map1.entrySet()) {
			
			System.out.println(m);
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			System.out.println("----");
			
		}
		
		
		System.out.println(map1.isEmpty());
		
		
//
	
		
	}

}
