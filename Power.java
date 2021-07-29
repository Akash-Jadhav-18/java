import java.util.Scanner;

class Power
{
	public static int power(int iNo1, int iNo2)
	{
		int iCnt = 0,iMult = 1;
		
		if(iNo1 < 0)
		{
			iNo1 = -iNo1;   
		}

		if(iNo2 < 0)
		{
			iNo2 = -iNo2;   
		}
		//          1           2               3
		for(iCnt = 1; iCnt <= iNo2; iCnt++)
		{
			iMult = iMult * iNo1;   // 4
		}

		return iMult;
	}

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int iValue1 = 0, iValue2 = 0;
		int iRet = 0;
		
		System.out.printf("Enter first number\n");
		iValue1 = sc.nextInt();

		System.out.printf("Enter second number\n");
		iValue2 = sc.nextInt();

		iRet = power(iValue1,iValue2);

		System.out.printf("Result is : %d\n",iRet);
		
		sc.close();
	}

	
	
}