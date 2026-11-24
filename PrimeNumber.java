package javaprogramming;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		boolean flag=false;
		if(n==1) 
		System.out.println("it is not a prime number");
		else {
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.println("it is not a prime number ");
					flag=true;
					break;
				}
			}
		
			if(flag==false)
				System.out.println("its a prime number");
			sc.close();
		}
	
	}
	
}	
		
	

		
		
		
		
			
		
		
	


