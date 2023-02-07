import java.util.Scanner;
class conditional
{
   public static void main(String args[])
  { 

    Scanner sc=new Scanner(System.in);
    System.out.println("enter num1");
    int num1=sc.nextInt();
    System.out.println("enter num2");
    int num2=sc.nextInt();
    System.out.println("enter num3");
    int num3=sc.nextInt();
    int grtnum=(num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
    System.out.println("the greatest number is : "+grtnum);

  }
}