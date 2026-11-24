package javaprogramming;

import java.util.Scanner;

public class PllindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
        int original = num;
		
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		System.out.println("reverse of a number is:" + rev);
		if (rev == original)

			System.out.println("its a pallindrome number");

		else

			System.out.println("its not a pallindrome number");

		sc.close();
	}

}
