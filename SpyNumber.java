package javaprogramming;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enrter the value of number");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;

		while (num != 0) {
			int digit = num % 10;
			sum = digit + sum;
			product = digit * product;
			num = num / 10;
		}
		System.out.println("product of number:" + product);
		System.out.println("sum of the digits :" + sum);

		sc.close();
		if (product == sum) {
			System.out.println("it is a spy number"); 
		} else {
			System.out.println("its not a spy number");
		}

	}

}
