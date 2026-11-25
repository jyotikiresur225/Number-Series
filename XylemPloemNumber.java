package javaprogramming;

import java.util.Scanner;

public class XylemPloemNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int mean=0;
		int extream=n%10;
		
		n=n/10;
		while(n>9)
		{
			int digit=n%10;
			mean=mean+digit;
			n=n/10;
		
		}
		extream=extream+n;
		
		if(mean==extream)
		System.out.println("it is a xylem number");
		else
			System.out.println("it is a phloem number");
			
 	}

}
