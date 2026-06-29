import java.util.Scanner;
public class IT26100770Lab9Q1
{
	public static void cc(double a, double b, double c)
	{
		double mathpow = (Math.pow(b, 2) - (4 * a * c));
		
		if(mathpow<0)
		{
			System.out.println("No real roots");
			return;
		}
		
		double x1 = (-b + Math.sqrt(mathpow)) / (2 * a);
		double x2 = (-b - Math.sqrt(mathpow)) / (2 * a);

        System.out.println("Root 1: "+x1);
        System.out.println("Root 2: "+x2);	
	}
	
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();
		
		System.out.println();
		System.out.println("Roots are real and different :");
		
		cc(a, b, c);
	}
}