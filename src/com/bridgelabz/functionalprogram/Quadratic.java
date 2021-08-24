package com.bridgelabz.functionalprogram;
import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		double a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a b and c");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double delta = (b*b)-4*a*c;
		double root1=(-b + Math.sqrt(delta))/(2*a);
		double root2=(-b - Math.sqrt(delta))/(2*a);
		System.out.println("Root 1 :"+root1+" Root 2 : "+root2);
	}

}
