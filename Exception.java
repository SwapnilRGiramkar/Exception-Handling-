//This Program Gives an Arithmetic exception when we devide by Zero
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

		int ans =num/den;
		System.out.println(ans);
		System.out.println("Thanks Visit again");
	}
}
//This Program gives NullPOinterException
import java.util.Scanner;
class Number
{
	public static void main(String[] args) 
	{
		Scanner sc =null;
		System.out.println("Enter the Numonator : ");
		int num=sc.nextInt();
		System.out.println("Enter the Denominator : ");
		int den=sc.nextInt();

		int ans =num/den;
		System.out.println(ans);
		System.out.println("Thanks Visit again");
	}
}

