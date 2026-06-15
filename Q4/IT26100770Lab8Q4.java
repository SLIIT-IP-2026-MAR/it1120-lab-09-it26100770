import java.util.Scanner;
public class IT26100770Lab8Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int studentsArray [] = new int [8];
        int numberCount = 0;
        int idInput;
        
        while (numberCount<8)
        {
            System.out.print("Enter Student ID for Student " +(numberCount+1)+ ": ");
            idInput = input.nextInt();
            
            if (idInput>0)
            {
                studentsArray[numberCount] = idInput;
                numberCount++;
            }
            else 
            {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }
		System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();
		System.out.println();
        
		int i;
        for (i = 0; i < studentsArray.length; i++)
        {
            if (studentsArray[i] == searchID)
            {
                break;
			}	
        }
        
        if (i < studentsArray.length) 
        {
            System.out.println("Student is Available");
        }
        else
        {
            System.out.println("Student is Not Available");
        }
    }
}