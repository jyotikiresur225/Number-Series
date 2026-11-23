package javaprogramming;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println(0);

		}

		if (n >= 2) {
			int fib1 = 0;
			int fib2 = 1;

			int fib3 = 0;
			System.out.print(fib1 + " " + fib2 + " ");
			for (int i = 3; i <= n; i++) {
				fib3 = fib1 + fib2;
				System.out.print(fib3 + " ");
				fib1 = fib2;
				fib2 = fib3;
			}

		}
		sc.close();

	}

}
