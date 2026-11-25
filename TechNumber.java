package javaprogramming;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int count=0;
		int temp=n;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		if(count%2==0)
		{
			int d=1;
			int halfcount=count/2;
			for(int i=1;i<=halfcount;i++)
			{
				d=d*10;
			}
			int fhalf=temp/d;
			int shalf=temp%d;
			int sum=fhalf+shalf;
			int sq=sum*sum;
			if(sq==temp)
				System.out.println("it is a tech number");
			else
				System.out.println("it is not a tech number");
			sc.close();
				
		}
			
		}
	}


