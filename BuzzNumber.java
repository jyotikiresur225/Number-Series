package javaprogramming;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		//int digit=n%10;
		if(n%7==0 || n%10==7)
		{
			System.out.println("it is a buzz number");
			
		}
		else
			System.out.println("it is not a buzz number");
				
	}

}
