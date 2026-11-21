package javaprogramming;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println("it is a perfect number");
		else
			System.out.println("it is not a perfect number");
			
	}

}
