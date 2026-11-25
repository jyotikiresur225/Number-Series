package javaprogramming;

import java.util.Scanner;

public class SpecialTwoDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int original=n;
		int d1=n%10;
		int d2=n/10;
		 
		int product=d1*d2;
		int sum=d1+d2;
		
	  int result=product+sum;
	  if(result==n)
		  System.out.println("it is a special two digit number");
	  else
		  System.out.println("it is not a special two digit number");
		  sc.close();
				
	}

}
