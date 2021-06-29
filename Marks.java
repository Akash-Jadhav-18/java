/*
    0 to 35         Fail
    35 to 50       Pass class
    50 to 60       Second class
    60 to 70       Fisrt class
    70 to 100     Distinction
 */
 
import java.util.Scanner;

class Marks
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int iMarks = sc.nextInt();
		
		CheckResult(iMarks);
	}
	
	public static void CheckResult(int iMarks)
	{
		if((iMarks < 0) || (iMarks > 100))  // Input filter
		{
			System.out.println("Invalid marks");
			return;
		}
		if((iMarks >= 0) && (iMarks < 35))
		{   System.out.println("You are failed..");   }
		else if((iMarks >= 35) && (iMarks < 50))
		{   System.out.println("Pass class"); }
		else if((iMarks >= 50) && (iMarks <60))
		{   System.out.println("Second class");   }
		else if((iMarks >=60) && (iMarks < 70))
		{   System.out.println("First class");    }
		else
		{   System.out.println("Distinction\n");    }
	}

	
	
}