package javaprogramming;

import java.util.Scanner;

public class SmallestDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		int smallestDigit=9;
		
		
		while(n!=0)
		{
			int digit=n%10;
			if(digit<smallestDigit) {
				smallestDigit=digit;
		}
		n=n/10;
	}
    System.out.println("the smallest digit is:"+smallestDigit);
    sc.close();
	}

}
