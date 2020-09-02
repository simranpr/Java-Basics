package basics;
public class InfinityNanCheck 
{
    public static void main(String[] args)
    {   
        //System.out.println(10/0);       // RE:java.lang.ArithmeticException: / by zero
        System.out.println(10.0/0);	//Infinity
        System.out.println(-10.0/0);    //-Infinity
		
        System.out.println("");
        //System.out.println(0/0);	// RE:java.lang.ArithmeticException: / by zero
        System.out.println(0.0/0);	//Nan (Not a Number)
        System.out.println(-0.0/0);	//Nan (Not a Number)
    }
}
