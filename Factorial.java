// Accept number from user and return its factorial
// Input : 5
// Output : 5*4*3*2*1       (120)

// Input :4
// Output : 4*3*2*1         (24)
//              1*2*3*4         (24)


import java.util.Scanner;

class Factorial
{
	public static int Fact(int iNo)
	{
		int iMult = 1;
		
		if(iNo < 0)
		{
			iNo = -iNo; 
		}

		while(iNo > 0)
		{
			iMult = iMult * iNo;
			iNo--;
		}
		
		return iMult;
	}

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int iValue = 0;
		int iRet = 0;
		
		System.out.println("Enter number");
		iValue = sc.nextInt();

		iRet = Fact(iValue);

		System.out.println("Factorial is " + iRet);
	}
}