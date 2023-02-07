import java.util.Scanner;
class leapyear{

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Entry Year");
	int year=sc.nextInt();
	if(year%4==0)
	{
	 System.out.println("it is a leap year"+year);
	}
	else{
	System.out.println("it is not a leap year"+year);
	}
}
}