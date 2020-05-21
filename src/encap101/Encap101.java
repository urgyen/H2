package encap101;

public class Encap101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Encapsulation 
			//1. Data privacy
			//2. Logic Check
			//3. Dot operators  --> getters and setters
		
		StudentDetails s1= new StudentDetails();
		s1.setName("Apple");
		s1.setAge(30);
		
		
		//s1.age=1500;
		
		//Logic fees >5000 ; Principal bhetneeyy
		s1.setFeesPayable(4000);
		 
		System.out.println("----");
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getFeesPayable());
			
		//System.out.println(s1.name);
		
		
		
//		s1.name= "ASDF";
//		s1.age =150;
//		s1.feesPayable =6000;
////		
//		System.out.println(s1.name);
		
		
		
		

		
		
	}

}
