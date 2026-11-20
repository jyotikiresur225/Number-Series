package javaprogramming;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of base of triangle");
		double b=sc.nextDouble();
		
		System.out.println("enter the value of height of triangle");
		double h=sc.nextDouble();
		
		double areaOfTriangle=0.5f*b*h;
		System.out.println("Area of triangle="+areaOfTriangle);
		
	}
}
