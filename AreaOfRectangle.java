package javaprogramming;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		double l=sc.nextDouble();
		
		System.out.println("enter breadth of rectangle");
		double b=sc.nextDouble();
		
		
		double areaOfRectangle=l*b;
		System.out.println("Area of rectangle:"+areaOfRectangle);
		
	}

}
