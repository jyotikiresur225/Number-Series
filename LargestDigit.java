package javaprogramming;

import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		int largestDigit=0;
		
		
		while(n!=0)
		{
			int digit=n%10;
			if(digit>largestDigit) {
				largestDigit=digit;
		}
		n=n/10;
	}
    System.out.println("the largest digit is:"+largestDigit);
    sc.close();
}
		
}	
		
				
	


