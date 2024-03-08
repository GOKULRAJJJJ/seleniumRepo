package week1.Assignments;

public class Isprime2 {
	public static void main(String[] args) {
		int number = 12;
		int count = 0;
		
		for (int i = 1; i <= number; i++) {
		
		
			if (number % i == 0) {
			
			count ++;
		}
			
		}
		
		if (count == 2) {
			
			System.out.println("Not Prime" + number);
		}
		
		else {
			System.out.println("Prime" + number);
		}
		
		
	}
	
	
	}


