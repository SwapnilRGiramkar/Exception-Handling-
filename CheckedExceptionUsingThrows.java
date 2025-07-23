//This is the example of Checked Exception Using throws 
//Using throws 
package exception;

public class CheckedUsingThrows 
{
	public static void main(String[] args)  throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Neil Is Star");
			Thread.sleep(2000);
		}
	}
}

