package com.bridgelabz.functionalprogram;
import java.lang.Math;
import java.util.*;
public class Distance {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int x,y;
			double distance;
			System.out.println("Enter x,y");
			x=sc.nextInt();
			y=sc.nextInt();
			distance=Math.sqrt((x*x)+(y*y));
			System.out.println("The distance is :"+distance);
	}

}
