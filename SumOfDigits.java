package javaprogramming;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter the value of number:");
		  int num = sc.nextInt();
		  
		  int sum=0;
		  while(num!=0) {
			  int digit=num%10;
			  sum=digit+sum;
			  num=num/10;
			  
		  }
		  System.out.println("sum of the digits :"+sum);
		  sc.close();
	}

}
