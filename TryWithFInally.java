//This example of using finally with try block without handling exception 
package exception;
import java.util.Scanner;
public class Exp2 
{
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the First number : ");
			int num1=sc.nextInt();
			System.out.println("Enter the second number : ");
			int num2=sc.nextInt();
			System.out.println("hello");//This statement is not printed
			int ans =num1+num2;
			System.out.println(ans);
		}
		finally
		{
			System.out.println("Its Mandatory to execute ");
		}
	}
}

