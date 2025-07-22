//This program Solve using only one catch block 
import java.util.Scanner;
class Number
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Numonator : ");
		int num=sc.nextInt();
		System.out.println("Enter the Denominator : ");
		int den=sc.nextInt();

		try
		{
			int ans =num/den;
			System.out.println(ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont devide by 0");
		}
		System.out.println("Thanks Visit again");
	}
}
