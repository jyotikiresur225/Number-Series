package javaprogramming;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enrter the value of number");
		int num = sc.nextInt();
		
		int product=1;
		
		while(num!=0)
		{
			int digit=num%10;
			product=digit*product;
			num=num/10;
		}
		System.out.println("product of number:"+product);
		sc.close();
				
	}

}
