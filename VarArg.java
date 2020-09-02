package basics;

public class VarArg 
{
    public void check(int... a) /*Duplicate method name check with signature "([I)V"
                                  This is because internally check var-arg() will be converted to check 1-D array only.*/
    {
        System.out.println("Var-Arg()");
    }
    /*public void check(int[] a)
    {
        System.out.println("int 1-D Array");
    }*/
    public static void main(String[] args)
    {
        VarArg obj=new VarArg();
        obj.check(1,2,3,4);
    }
}
