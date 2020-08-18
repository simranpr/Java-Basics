//**This program shows the concept of anonymous arrays.It calculates sum of elements using for each loop.**
package com.basics.arrays;
import java.util.Scanner;
public class AnonymousArrays 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 values:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		sc.close();
		AnonymousArrays obj=new AnonymousArrays();
		System.out.println(obj.sum(new int[] {num1,num2,num3,num4}));
	}
	public int sum(int[] arr)
	{
		int total=0;
		for(int x:arr)
		{
			total=total+x;
		}
		return total;
	}
}
