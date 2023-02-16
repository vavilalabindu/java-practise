import java.util.Scanner;
class method_users_values
{
 public static void main(String args[])
 {

    Scanner sc=new Scanner(System.in);
   System.out.println("enter first number");
   int num1=sc.nextInt();
   System.out.println("enter second number");
    int num2=sc.nextInt();
   method_users_values obj=new method_users_values();//created obj to call non static method
   int add= obj.addition(num1,num2);//returned value is stored in add(variable)
   obj.subtraction(num1,num2);
    System.out.println("add is : "+ add);
 }

 public int addition(int num1,int num2)//method with return and parameters
 {
    return (num1+num2);
 }
 public void subtraction(int num1,int num2)//method with parameters
 {
    System.out.println("subtraction is : "+ (num1-num2));
 }

}