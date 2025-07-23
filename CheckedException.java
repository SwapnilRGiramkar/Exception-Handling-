//This is Checked Exception by compiler without adding try catch() block or throws its provide error
//Using try catch() block
package exception;

public class Checked 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" I Love India");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException  e)
			{
				
			}
		}
	}
}

