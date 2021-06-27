// Accept number from user and check whether that number is dicisible by 3 and 5.
// Input : 10
// Output : No

// Input :15
// Output : Yes


import java.util.Scanner;
class NumberX
{
	public static boolean CheckDivisible(int iNo)
	{
		if(((iNo % 3) == 0) && ((iNo % 5) == 0))
		{ return true; }
		else
		{ return false; }
	}
}
class Divisible
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int iValue = 0;
		boolean bRet;
		System.out.println("Enter number  ");
		iValue = sc.nextInt();
		
		
		
		bRet = NumberX.CheckDivisible(iValue);   // CheckDivisible(7)  15  12  7
		if(bRet == true)
		{
			System.out.println(iValue + "  is devisible by 3 and 5\n");
		}
		else
		{
			System.out.println(iValue + "  is not devisible by 3 and 5\n");
		}
		
	}
}
