import java.util.Scanner;
public class IT26100770Lab8Q1B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int myArray [] = new int [5];
		int evenArray[] = new int[5];
		
		System.out.println("Enter 5 Numbers:");
	
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print("Enter Numbers " + (i+1) + ": ");
			myArray[i] = input.nextInt();
        }
		
		System.out.println();
		System.out.println("myArray Contents:");
		
		for(int i=0; i<myArray.length; i++)
		{
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println();
		System.out.println("evenArray Contents:");
		int counter=0;
		
		for(int i=0; i<myArray.length; i++)
		{
			if(myArray[i]%2==0)
			{
				evenArray[counter] = myArray[i]; 
				counter++;
			}
		}
		for (int i=0; i<evenArray.length; i++)
			{
				System.out.print(evenArray[i] + " ");
            }
	}
}
