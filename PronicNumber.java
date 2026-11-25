package javaprogramming;

import java.util.Scanner;

public class PronicNumber {
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	  boolean flag=false;
	  for(int i=1;i*(i+1)<=n;i++)
	  {
		if(i*(i+1)==n) 
		{
			System.out.println("it is a pronic number");
			flag=true;
			break;
		}
	  }
			  if(flag==false)
				  System.out.println("it is not a pronic number");
			  sc.close();
}
}
