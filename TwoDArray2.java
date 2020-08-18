package com.basics.arrays;
import java.util.Scanner;
public class TwoDArray2 
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the values:");
		for(int i=0;i<2;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=sc.nextInt();
		
		System.out.println("\nFinal Array:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println(" ");
		}
		
		/*System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);*/
		
	}
}
