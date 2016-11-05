import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;


 
public class SieveOfEratosthenes
{
	public static void main(String args[]) 
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in); 
		final int MAX = 100;
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
				  
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
				
	}
	
}