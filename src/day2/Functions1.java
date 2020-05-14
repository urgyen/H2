package day2;

public class Functions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Functions
		//Hi
		//String response= sayHello();
		//System.out.println(response);
//		//arguments
//		int response= addNumber(55, 100);
//		System.out.println(response);
//		sayHello();
		//Odd
		String response = isOddOrEven(0);
		System.out.println(response);
		
		checkPrime(7);
		
		printName(15);
		
		}
	
	//Function
	static void printName(int loop) {
		
		for(int i=0; i<loop; i++) {
			System.out.println(i+ "_ ASASD");
		}
		
	}
	
	
	//4
		static void checkPrime(int number) {
			
			boolean flag= false;
			for(int i=2; i<number ; i ++) {
				
				if(number%i != 0) {
					flag= false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("Not Prime ");
			}
			else {
					System.out.println("Prime");
			}
		}
	
	
		static String isOddOrEven(int number) {
			
			if(number%2 == 0) {
				return "Even";
			}
			else {
				return "Odd";
			}
		}
	
		
		
		
	//num1 = 55
	
	//num2 = 100
	//paramter
	
//	static int addNumber(int num1,int num2) {
//		
//		int sum= num1+num2;
//		//System.out.println(sum);
//		return sum;
//		
//	}
//	
//	//return type
//	//void -- > nothing
//	
//	static void sayHello() {
//		
//		System.out.println("Hello From Nepal");
//		
////		return "heyy";
//	}
	
	//method name should be verb?
	//method
	
	//Function 4 types'
		//return type
		//argument
	
	//A. Function with argument and return type; 			ok
	//B. Function with argument and no return type; 		ok
	//C. Function with no argument and return type; 		ok
	//D. Function with no argument and  no return type ;	ok
	
}
