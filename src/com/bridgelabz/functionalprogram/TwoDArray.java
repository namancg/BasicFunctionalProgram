package com.bridgelabz.functionalprogram;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		int i,j,row,column;
		int arr[][]=new int[20][20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Row");
		row =sc.nextInt();
		System.out.println("Enter Number of Column");
		column=sc.nextInt();
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("2D Array is :");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+"");
			}
	
			}

	}

}
