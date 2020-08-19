package com.basics.arrays;

public class TwoDArray4 
{
	public static void main(String[] args)
	{
		String[] s= {"ab", "abc", "abcd", "abcde"};
		System.out.println("Length of Array s:"+s.length);
		//System.out.println(s.length());
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Length of "+s[i]+": "+s[i].length());
		}
	}
}
