import java.text.DecimalFormat;
import java.util.Scanner;

public class MathLab04st {
	public static void main(String args[]) {
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		System.out.println("\nMathLab04\n");
		System.out.print("Enter upper prime limit. ");
		final int MAX = input.nextInt();
		input.close();
		boolean primes[];
		primes = new boolean[MAX+1];
		for (int i = 0; i < primes.length; i++)
			primes[i] = true;
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[]) {
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		int currentNum = 2;
		while (currentNum < primes.length) {
			for (int i = 0; i < primes.length; i++) {
				if (i % currentNum == 0 && i != currentNum)
					primes[i] = false;
			}
			currentNum++;
		}
	}

	public static void displayPrimes(boolean primes[]) {
		int counter=0;
		System.out.println("\n\nPRIMES BETWEEN 1 AND " + (primes.length-1));
		DecimalFormat dec = new DecimalFormat("0000");
		for (int i = 2; i < primes.length; i++){
			if(counter>32){
				System.out.println();
				counter=0;
			}
			if (primes[i] == true){
				System.out.print(dec.format(i) + " ");
				counter++;
			}
		}
		System.out.println();
	}

}
