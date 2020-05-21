package encap101;

public class StudentDetails {
	// state
	private String name;
	private int age;
	private double feesPayable;

	// methods

	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	//age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		
		//username and password
		
		// condition
		if (age < 100) {
			this.age = age;
		} else {
			System.out.println("Input Valid Age");
		}

	}

//fees
	public double getFeesPayable() {
		return feesPayable;
	}

	public void setFeesPayable(double feesPayable) {
		
		if(feesPayable>5000) {
			System.out.println("Go See Principal");
			this.feesPayable = feesPayable;
			
		}
		else {
			
			this.feesPayable = feesPayable;

		}
		
	
	}

	// behaviours
}
