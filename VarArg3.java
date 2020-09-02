package basics;

public class VarArg3 
{
    public static void check(int[]... a)
    {
        for(int[] a1: a)
        {
            for(int a2: a1)
            {
                System.out.println(a2);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr1={10,20,30};
        int[] arr2={40,50,60};
        check(arr1,arr2);
    }
}
