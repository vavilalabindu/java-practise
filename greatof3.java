import java.util.Scanner;
class greatof3{

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number");
	int num1=sc.nextInt();
	System.out.print("Enter second number");
	int num2=sc.nextInt();
	
	System.out.print("Enter third number");
	int num3=sc.nextInt();

	if(num1>num2)
	{
		if(num1>num3)
		{
			System.out.println(num1+"is the greatest number");
		}

		else
		{
		      System.out.println(num3+"is the greatest number");
		}
		
	}
	else
	{
		if(num2>num3)
		{
			System.out.println(num2+"is the greatest number");
		}

		else
		{
		      System.out.println(num3+"is the greatest number");
		}
		

	}
	
       



}
}