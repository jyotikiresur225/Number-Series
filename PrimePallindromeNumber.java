package javaprogramming;

import java.util.Scanner;

public class PrimePallindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		sc.close();

		if (isPalindrome(num) && isPrime(num)) {
			System.out.println(num + " is a Prime Palindrome number.");
		} else {
			System.out.println(num + " is NOT a Prime Palindrome number.");
		}
	}

	// Method to check pallindrome
	static boolean isPalindrome(int number) {
		int original = number;
		int rev = 0;
		while (number != 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number /= 10;
		}
		return original == rev;
	}

	// Method to check prime
	static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
