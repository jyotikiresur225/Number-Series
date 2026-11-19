package javaprogramming;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		double r=sc.nextDouble();
		final float pi=3.14f;
		
		double areaOfCircle=pi*r*r;
		System.out.println("Area of circle="+areaOfCircle);
		sc.close();
				
	}

}
