package day4;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new object initialization
		Human h1 = new Human();
		// instance Variable
		h1.name = "Urgyen";
		h1.age=25;
		h1.address="Nepal";

		h1.eat();
		h1.sleeps();
		//h1.printName(10);
		h1.checkOldOrNot();
		System.out.println("Age Statuss: " + h1.isOldOrNot);
		
		System.out.println(" ------ -  - - ");
		// new object initialization
		Human h2 = new Human();
		// instance Variable
		h2.name = "Nisha";
		h2.age=18;
		h2.address="USa";
		//h2.printName(10);
		h2.checkOldOrNot();
		System.out.println("Age Statuss: " + h2.isOldOrNot);

		
//
		// new object initialization
//		Human h3 = new Human();
//		// instance Variable
//		h3.name = "adarsh";
//		h3.age=20;
//		h3.address="USA";
//		h3.printName(10);
//
//		System.out.println(h1.name);
//		System.out.println(h2.name);
//		System.out.println(h3.name);
//		
//		System.out.println(h1.address);
//		System.out.println(h2.address);
//		System.out.println(h3.address);
		
	}

}
