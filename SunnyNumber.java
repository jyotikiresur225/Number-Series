package javaprogramming;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		n=n+1;
		boolean flag=false;
		for(int i=1; i<=n;i++)
		{
			int a=i*i;
			//System.out.println(i);
			if(a==n)
			{
				System.out.println("it is a sunny number");
				flag=true;
				break;
				
			}
		}
		if(flag==false)
			System.out.println("it is not a sunny number");
		sc.close();
	}
}
