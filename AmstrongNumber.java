package javaprogramming;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int count=0;
		int sum=0;
		int temp1=n;
		int temp2=n;
		
		while(n!=0)
		{
			
			count++;
			n=n/10;
		}
		while(temp1!=0)
		{
			int digit=temp1%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*digit;
			}
			sum=sum+prod;
			temp1=temp1/10;
		}
		if(sum==temp2)
			System.out.println("it is an amstrong number");
		else
			System.out.println("it is not a amstrong number");
		sc.close();
	}

}
