package javaprogramming;

import java.util.Scanner;

public class CircumferenceOfCircle {
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the value of radius");
	  double r=sc.nextDouble();
	  final float PI=2.14f;
	  
	  double circumferenceOfCircle=2*PI*r;
	  System.out.println("Circumference of circle="+circumferenceOfCircle);
	  sc.close();
	  
	  
			  
	
}
}
