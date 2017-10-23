package P4.LargestPalindromeProduct;

public class Main {

	public static void main(String[] args) {

		int r, sum = 0, temp;
		int counter = 0;// It is the number variable to be checked for palindrome

		
		
		do{
			temp = counter;
			r = counter % 10; // getting remainder
			sum = (sum * 10) + r;
			counter = counter / 10;
			if (temp == sum)
				System.out.println("palindrome number ");
			else
				System.out.println("not palindrome");
			
			counter++;
			
		}while(counter < 100);
		
	}

}
