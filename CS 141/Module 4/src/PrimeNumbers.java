import java.util.Arrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n = 1_00; //underscores are ignored by complier. Just for our eyes.
		int[] primes = { 13, 2, 20, -3, 3, 1 };
		String primeString = Arrays.toString(primes);
		System.out.println(primeString);
//		System.out.println(countPrimes(n));
	}

	// tests whether a give number is prime
	public static boolean isPrime(int number) {
		if (number < 2)
			return false;
		int divisor = 2;
		while (divisor <= Math.sqrt(number)) {
			if (number % divisor == 0) {
				// System.out.println(divisor + " is a factor.");
				return false;
			}
			divisor++;
		}
		// System.out.println("We checked up to: " + divisor);
		return true;
	}
	
	// counts the number of primes up to and including n
	public static int countPrimes(int n) {
//		int count = 0;
//		for (int i = 2; i <= n; i++) {
//			if (isPrime(i)) {
//				count++;
//			}
//		}
//		return count;
		
		int count = 0;
		boolean[] composite = new boolean[n + 1]; //these are set to false by default
		for (int i = 2; i <= n; i++) {
			if (!composite[i]) { //if i is prime
				count++;  //count it
				for (int j = 2*i; j <= n; j += i) {//mark off all the multiples of i
					composite[j] = true;
				}
			}
		}
		return count;
	}
		
		


	
}
