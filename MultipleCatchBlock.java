//This pRogram with multiple Catch block but one catch block handle only one 
import java.util.Scanner;
class Number
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc =null;
			System.out.println("Enter the Numonator : ");
			int num=sc.nextInt();
			System.out.println("Enter the Denominator : ");
			int den=sc.nextInt();
			int ans =num/den;
			System.out.println(ans );
			System.out.println("Visit again");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont devide by 0");
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont provide reference as Null");
		}
		System.out.println("Thank You");
	}
}
