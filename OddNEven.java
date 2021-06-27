// Accept number from user and check whether that number is even or odd.
// Input : 4
// Output : Its even

// Input :7
// Output : Its odd

import java.util.Scanner;

class NumberX
{
	public boolean CheckEven(int iNo)
	{
		if((iNo % 2) == 0)
		{   return true;    }
		else
		{   return false;   }
	}
	
}

class OddNEven
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int iValue = 0;
		boolean bRet = false;
		NumberX obj = new NumberX();
		
		System.out.println("Enter the number");
		iValue = sc.nextInt();
		
		bRet = obj.CheckEven(iValue);   // CheckEven(12)
		
		if(bRet == true)
		{
			System.out.println(iValue +  " is Even number\n");
		}
		else
		{
			System.out.println(iValue +  " is odd number\n");
		}
		
	}
}