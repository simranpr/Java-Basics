package basics;

public class VarArg2 
{
    public static void check(int... a)
    {
        System.out.println("Var-Arg Method");
    }
    public static void check(int a)
    {
        System.out.println("Normal Method");
    }
    public static void main(String[] args)
    {
        check();                //Var-Arg Method
        check(50);              //Normal Method
        check(50,80);           //Var-Arg Method
        check(10,20,30,40,50);  //Var-Arg Method
    }
}
