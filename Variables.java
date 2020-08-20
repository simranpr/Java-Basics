package array;

public class Variables 
{
	int instance_var=10;
	static int static_var=20;
	public static void main(String[] args) 
	{
		Variables obj=new Variables();
		System.out.println("-----Main()-----");
		//instance_var=10; --> Cannot access instance variable directly from static context without object reference 
		System.out.println("Instance Variable:"+obj.instance_var);
		
		System.out.println("Static Variable direct:"+static_var);//--> Can be accessed directly without object reference
		System.out.println("Static Variable with class name:"+Variables.static_var); /* Recommended! Should be accessed with class name but in same class, 
		it can be used without class name also*/ 
		System.out.println("Static Variable with object reference:"+obj.static_var);//--> Can be accessed with object reference
		
		obj.function();
		Implementation imp=new Implementation();
		imp.display();
	}
	public void function()
	{
		System.out.println("----Function()----");
		instance_var=50; //--> Can be accessed directly without object reference
		System.out.println("Instance Variable without object:"+instance_var);
		static_var=60; // --> Can be accessed directly without object reference	
	}
}
class Implementation
{
	public void display()
	{
		Variables obj=new Variables();
		System.out.println("----Display()----");
		System.out.println("Intance variable with object:"+obj.instance_var);
		//System.out.println("Instance variable with object:"+instance_var);
		System.out.println("Static variables with object:"+obj.static_var); //Can access static variable with object
		//reference but not recommended
		System.out.println("Static variables with class name:"+Variables.static_var);
	}
	
}