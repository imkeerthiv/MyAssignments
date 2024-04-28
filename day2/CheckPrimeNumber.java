package week1.day2;
import java.util.*;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int n= sc.nextInt();

if(isPrime(n))
{
			
			System.out.println("The entered number is a prime number");
}
else
{
			System.out.println("The entered number is not a prime number");
}
		}
	}

	private static boolean isPrime(int n) {
		return false;
	}

}
