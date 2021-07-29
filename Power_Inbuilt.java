// import java.lang.Math;
import java.util.Scanner;

class Power_Inbuilt
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int iValue1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int iValue2 = sc.nextInt();
		
		Integer v1 = iValue1;
		Integer v2 = iValue2;
		
		int iRet =  (int) (Math.pow(v1.doubleValue(),v2.doubleValue()));  //static double pow​(double a, double b); (Math class)
								// public double doubleValue(); // (Integer & Float class)
		
		System.out.println("Result is " + iRet);
		
	}
}