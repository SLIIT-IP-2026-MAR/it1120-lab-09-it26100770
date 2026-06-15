import java.util.Scanner;
public class IT26100770Lab8Q3 
{
    public static void main (String[] args)
	{
        Scanner input = new Scanner (System.in);
    
        int numberArray [] = new int [6];
        int numberCount = 0;  
        int userInput;
        
        while (numberCount < 6)
        {
            System.out.print("Enter a Positive Number (" + (numberCount+1) + "/6): ");
            userInput = input.nextInt();
            
            if (userInput > 0) 
            {
                numberArray[numberCount] = userInput;
                numberCount++;
            }
            else 
            {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }
        
		System.out.println();
		System.out.println("Array Contents:");
        
        for (int count = 0; count < numberArray.length; count++)
        {
            System.out.print(numberArray[count] + " ");
        }
		
		int maxNumber = numberArray[0];
        
        for (int count = 0; count < numberArray.length; count++)
        {
            if (numberArray[count] > maxNumber)
            {
                maxNumber = numberArray[count];
            }
        }
        
        System.out.println();
        System.out.print("The Maximum Number Entered: " + maxNumber);
        
    }
}
