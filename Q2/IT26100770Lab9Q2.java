import java.util.Scanner;
public class IT26100770Lab9Q2
{
	public static double circleArea(double radius)
	{
	  return Math.PI*radius*radius;
    }
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextDouble();
				
        double cc = circleArea(radius);
		System.out.println("The area of the circle with radius " + radius + " is : " + cc);
	}
}