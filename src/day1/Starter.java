package day1;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A.java File  --> location 
//		 
//		Terminal ..args location
//			javac A.java
//			
//		A.class
//		
//		Terminal 
//			java A
//			
//		Output	
		
//		System.out.println("Hello");
//		System.out.println("Environment");
//		
		
		//Datatype
		//Varibale does store data
		//value in data does vary
		//Operator
		
		int x1= 1;
		String name= "Hari";
		
		//Naming Convention
		//1. dont use single letter character;
		//int i, int j?
		//2. no white spaces
		//int first name ="";
		//3. 
	//	String _name= "Apple";
		
	//	should always start with small letter
	//	System.out.println(_name);
		
		//4. Camel CAsing
			//upper 
			//lower
//		String 	schoolOfHariDai ="MIT";
//			//	schoolodharidai
//		
//		//Datatype
//		//int x= 5.5;
//			//Primitive 
//			//Non primitive
//		
//		String age= "25";
//		//PArsing
//		int ageInNumber= Integer.parseInt(age);
//		
//		 //minus 5
//		System.out.println(ageInNumber-5);
//		
	
		
//		double num1 = 5.5;
//		//Spillage
//		int num2= num1;
		
//		int num3 = 10;
//		double num4= num3 +5;
//		
//		System.out.println(num4);
		
	//	boolean isTRue= true;
		
		//Operator?
		
		int num1= 15, num2 =15;
		int sum= num1+ num2;
		System.out.println(sum);
		
		System.out.println(7 % 4);
		
		int numberToCheck =16;
		
		if((numberToCheck%2)==0) {
			System.out.println("Even");
		}
		
		
		//Unary Operators post pre;
		
		int i=500;
		i++;
		//i =500+1;
		//6
		i--;
		//i=501-1
		//5
		i--;
		//i=i-1;
		//4

		//i=i+1;
		System.out.println(i);
		
		
		
		
		// ternary Operator
		//Condition false  ? if true  : if false
		String result= ((6%2)==0) ? "The number is Even" :"The number is Odd" ;
		System.out.println(result);
		
		
//		Java 3 ta kura ;
		
		
//		1. Lets do something 
		
//		2. Lets do that if that happens
		//DEcision Control
//			--if else
//				--else if
//					--switch
			
		
		//Scenario 
		//Nepal =="Oli baa"
		//India == "Modi"
		
		
		//USA =="" Trump
		
		
		String country=	"USA";
		
		if(country=="Nepal") {
			System.out.println("Oli baa");
		}
		
		else if(country =="India") {
			System.out.println("Modi");
		}
		
		else if(country== "USA") {
			System.out.println("TRump");
		}
		
		else {
			System.out.println("Wrong Input");
		}
		
		//Switch afai padera aaunus??
		
		
			
//		3. Lets do that again and again
		//@Loop
		
		
		//11
//		while(i1<= 10) {
//			System.out.println(i1+ "__rIndefinite");
//			
//			i1++;
//			
		
//		
//		int i1=1;
//		
//		System.out.println("value of i1__" + i1);
//
//		do {
//			System.out.println("Hello_ " +i1);
//			i1++;
//		}while(i1<=10);
		
		//for
		//intilaize
		//kah samma garne? condition
		//incerement or decrement
		
		for(int i11=1; i11<=100; i11=i11+2) {
			System.out.println(i11);
		}
		
	}

}
