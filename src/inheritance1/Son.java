package inheritance1;

public class Son extends Parent {

	
	
	
	// override
	void isWorking() {
		if (age > 16) {
			System.out.println("Working");
		} else {
			System.out.println("Grow up");
		}
	}
	
	
	
}
