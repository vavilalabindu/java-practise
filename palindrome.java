import java.util.Scanner;
class palindrome{

	public static void main(String args[])
	{
	 int rem=0,sum=0,temp;
     
	 Scanner sc=new Scanner(System.in);
 	 System.out.println("Enter a number");
	int num=sc.nextInt();
	  temp=num;
	 while(num!=0)
	{
	  rem=num%10;
	  sum=sum*10+rem;
	  num=num/10;
	}
	 if(sum==temp)
	 { System.out.println(temp+" is a palindrome");}
	 else	 
	 { System.out.println(temp+" is not a palindrome");}

	}




}