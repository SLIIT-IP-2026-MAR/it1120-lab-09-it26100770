import java.util.Scanner;
public class IT26100770Lab9Q3
{
	public static int add(int a, int b)
	{
      return a+b;
	}

	public static int multiply(int a,int b)
	{
		return a*b;
	}
	
	public static int squar(int a)
	{
		return a*a;
	}
	
	public static void main(String[] args)
	{
		int expression1 = squar(add(multiply(3,4),multiply(5,7)));
		System.out.println("Result od (3*4+5*7)^2       : "+expression1);
		 
	  	int expression2 = add(squar(add(4,7)),squar(add(8,3)));
	    System.out.println("Result of (4+7)^2+(8+3)^2  : "+expression2);
	}
}