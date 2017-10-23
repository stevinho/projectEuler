package P1.MultiplesOf3And5;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		 * Find the sum of all the multiples of 3 or 5 below 1000.
		 */

		int increment = 0; 
		int counter = 1000;
		int multiple = 0;
		for( ;increment < counter; increment++){
			
			if( (increment % 3 == 0) || (increment % 5 == 0) ){
				multiple += increment;
				
				System.out.println("Increment: " + increment + " " + "= " + multiple);
			}
		}
	}

}
