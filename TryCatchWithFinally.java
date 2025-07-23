//try block and catch() block with finally block
package exception;
//try catch with finally
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exp1 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Nemoninator : ");
			int num=sc.nextInt();
			System.out.println("Enter the denminator : ");
			int den=sc.nextInt();
			int ans=num/den;
			System.out.println(ans);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Provide Right Input ");
		}
		finally
		{
			System.out.println("Program will be run at any cost");
		}
	}
}

