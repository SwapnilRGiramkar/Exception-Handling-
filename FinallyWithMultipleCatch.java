//finally block with an multiple catc block
package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exp3 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number ");
			int num=sc.nextInt();
			int temp=num;
			int rev=0;
			while(temp>0)
			{
				int last=temp%10;
				rev=last+rev*10;
				temp/=10;
			}
			if(num==rev)
			{
				System.out.println("its Palindrome ");
			}
			else
			{
				System.out.println("its not palindrome ");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont / number by 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Provide rihgt Input");
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont provide reference as a null");
		}
		catch(Exception e)
		{
			System.out.println("Handle Exception by Exception class ");
		}
		finally
		{
			System.out.println("its Mandatory to execute ");
		}
	}
}
