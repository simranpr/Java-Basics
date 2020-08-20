package array;
public class VarArg1 
{
	public static void main(String[] args) 
	{
		sum();
		sum(10,20);
		sum(10,20,30,40,50,60);
	}
	public static void sum(int... arr)
	{
		int total=0;
		for(int val:arr)
		{
			total=total+val;
		}
		System.out.println("Total sum is:"+total);
	}
}
