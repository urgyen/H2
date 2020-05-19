package day4;

//blueprint
public class Human {
	// state
	// what we have

	// h1 				//h2
	// name= "Urgyen" 	//"Nisha"
	//age =25			//age =20
	String name;
	int age;
	String address;
	String isOldOrNot;

	// behaviour
	// what we do?
	void eat() {
		System.out.println("Eats");
	}

	void sleeps() {
		System.out.println("Sleeps");
	}

	void printName(int loop) {

		for (int i = 0; i < loop; i++) {
			System.out.println(i + name);
		}

	}
	
	void checkOldOrNot() {
		//age =25  // isoldornot = old
		//h2 age= 18 // isoldornot =still young
		if(age>20) {
			isOldOrNot= "old";
		}
		else {
			isOldOrNot= "still Young";

		}
		
		
		
	}

}
