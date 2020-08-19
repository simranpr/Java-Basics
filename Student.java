import java.util.*;
class Student
{
	void input()
	{
		int i,j;
		char name[]=new char[5];
		int roll[]=new int[5];
		int marks[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Names:");
		for(i=0;i<5;i++)
			name[i]=sc.nextString();
		System.out.println("Enter 5 Roll No.");
		for(i=0;i<5;i++)
			roll[i]=sc.nextInt();
		System.out.println("Enter Marks:");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
				marks[i][j]=sc.nextInt();
		}
		display(name,roll,marks);
	}
	void display(int name[],int roll[],int marks[][])
	{
		int i,j;
		for(i=0;i<5;i++)
			System.out.print(roll[i]+"		");
		for(i=0;i<5;i++)
			System.out.print(name[i]+"	");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
				System.out.println(marks[i][j]+"		");
		}
	}
}
class Main
{
	public static void main(String[] args)
	{
		Student stu=new Student();
		stu.input();
	}
}