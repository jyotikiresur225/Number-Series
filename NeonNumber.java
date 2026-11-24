package javaprogramming;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		int sq=n*n;
		 
		
		while(sq!=0)
		{
			
			int digit=sq%10;
			sum=sum+digit;
			sq=sq/10;
		}
		
		if(sum==n)
			System.out.println("it is  a neon number");
		else
			System.out.println("it is not a neon number");
		sc.close();
		
	}

}
