// Accept number from user and display its table
// Input 4
// Output : 4   8   12  16  20  24  28  32  36  40

// Input : 5
// Output : 5   10  15  20  25  30  35  40  45  50
/*
    
    Input 5
    
    5 * 1           5
    5 * 2           10
    5 * 3           15
    5 * 4           20              iNo                  5
    5 * 5           25              Common          5 * ____
    5 * 6           30              Start               1
    5 * 7           35              End                 10
    5 * 8           40              Displacement    1
    5 * 9           45
    5* 10          50

 */

import java.util.Scanner;
class Tables
{
	public static void DisplayTable(int iNo)
	{
		int iCnt = 0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		//      1             2                3
		for(iCnt = 1; iCnt <= 10; iCnt++)
		{
			System.out.printf("%d  ",(iNo * iCnt));       // 4
		}
	}

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int iValue = 0;
		System.out.println("Enter number");
		iValue = sc.nextInt();
		
		DisplayTable(iValue);
		
	}
}