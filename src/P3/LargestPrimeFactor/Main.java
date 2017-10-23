package P3.LargestPrimeFactor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<Long> primeFactors(Long numbers) {
        Long n = numbers;
        List<Long> factors = new ArrayList<Long>();
        for (Long i = 2l; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        
    	System.out.println("Primefactors of 600851475143");
        
    	Long longInput = 600851475143l;
    	
    	for (Long longNumber : primeFactors(longInput)) {
            System.out.println(longNumber);
        }
    }
}
