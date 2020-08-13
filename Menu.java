import java.util.*;
class Menu
{
	public int factorial(int num)
	{
		if(num==0)
			return 1;
		return(num*factorial(num-1));
	}
	public void prime(int num)
	{
		int flag=0;
		if(num<2)
			System.out.println(num+" is not a prime number");
		else if(num==2)
			System.out.println(num+" is a prime number");
		else if(num>2)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
					flag++;
			}
			if(flag>0)
				System.out.println(num+" is not a prime number");
			else
				System.out.println(num+" is a prime number");
		}
	}
	public void palindrome(int num)
	{
		int rem,rev=0,temp;
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}
	public void amstrong(int num)
	{
		int sum=0,rem,temp;
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==num)
			System.out.println(num+" is an amstrong number");
		else
			System.out.println(num+" is not an amstrong number");
		
	}
	public void fibonacci(int count)
	{
		int sum=0,i;
		int num1=0,num2=1;
		for(i=0;i<count;i++)
		{
			System.out.print(num1 +" ");
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		System.out.println(" ");
	}
	public void sumOfDigits(int num)
	{
		int sum=0,rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits is:"+sum);
	}
}
class Main
{
	public static void main(String[] args)
	{
		Menu obj=new Menu();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of test cases:");
		int t=sc.nextInt();
		while(t!=0)
		{
			System.out.println("\n\nCHOOSE:\n1.Factorial\n2.Prime No.\n3.Palindrome\n4.Amstrong no.\n5.Fibonacci Series\n6.Sum of Digits\n0.Exit");
			int ch,num=0;
			System.out.print("\nEnter your choice:");
			ch=sc.nextInt();
			if((ch>=1)&&(ch<=6))
			{
				System.out.print("Enter a number:");
				num=sc.nextInt();
				System.out.println("\n");
			}
			switch(ch)
			{
				case 1: System.out.println("Factorial:"+obj.factorial(num));
						break;
				case 2: obj.prime(num);
						break;
				case 3: obj.palindrome(num);
						break;
				case 4: obj.amstrong(num);
						break;
				case 5: obj.fibonacci(num);
						break;
				case 6: obj.sumOfDigits(num);
						break;
				case 0: System.exit(0);
				default: System.out.println("Invalid Input!");
			}
			t--;
		}
	}
}