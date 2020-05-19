package day3;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array --> object 
		//its a collection data with similar data type;
		
//		//Declare
//		int numbers[]= new int[5];
//		
//		//Data halxu
//		numbers[0]= 11;
//		numbers[1]=10;
//		numbers[2]=20;
//		numbers[3]=30;
//		numbers[4]=40;
//		//numbers[5]=50;
//
//	
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);

		
		//System.out.println(numbers.length);
//		
//		for(int index=0 ; index<numbers.length; index++) {
//			System.out.println(numbers[index]);
//		}
		
		//for each
//		for( int data :  numbers) {
//			
//			System.out.println(data);
//			
//		}
		
	//	String nameList[] = {"Urgyen" ,"Nisha", "Pratikshya", "Adarsh" ,"Abash" };
		//Array fixed sized	
	
		//System.out.println(nameList.length);
		
//		for(int i= 0; i< nameList.length ; i++) {
//			System.out.println(nameList[i]);
//		}
//		
		
//		for(String name : nameList) {
//			System.out.println(name);
//		}
		
		
		//Sceanrio
//		array= 10;
//		function ma array pass
//		kaam minimum ra maximum number print?
	
		int  numbers[] = {11,22,31,21,54,212,22,1,6,4,0,7,1};
		minMax(numbers);
		
		
		
	}
	
	static void minMax(int num[]) {
		
		int minimum = num[0];
		//11
		int maximum = num[0];
		
		for(int singleNumber : num) {
			
			if(minimum > singleNumber) {
				minimum= singleNumber;
			}
			
			//single number=31
			//maximum = 22
			if(maximum < singleNumber) {
				maximum= singleNumber;
			}
			
			
		}
		System.out.println("Minimum Number : " + minimum);
		System.out.println("Maximum Number : " + maximum);
		
	}
	
	// Java is an Object Oriented Langauage?
	//  Class  --> blueprint   ->>  Person  
		// state 
			// String name;
			// int age;
			// String college;
	
		//	behaviour --> what does it do?  -> verb
			//method/ function
	
			void eats() {
				System.out.println("EAting");
			}
	
		
	//	Object;;		
			
		//Country
			//State
			String name;
			String language;
			double poupulationSize;
			
			//Behavior
			void takesTax() {
				System.out.println("Ask for money");
			}
	
		// object Country Nepal, USA, India;
		// OOP
					
			

}
