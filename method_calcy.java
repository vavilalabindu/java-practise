import java.util.Scanner;
class method_calcy
{
 public static void main(String args[])
 {

    Scanner sc=new Scanner(System.in);
   System.out.println("enter first number");
   int num1=sc.nextInt();
   System.out.println("enter second number");
    int num2=sc.nextInt();
    System.out.println("enter your choice");
    int opt=sc.nextInt();

   method_calcy obj=new method_calcy();//created obj to call non static method
   int add= obj.addition(num1,num2);//returned value is stored in add(variable)
   int sub=obj.subtraction(num1,num2);
   int mul=obj.multiplication(num1,num2);
   int div=obj.division(num1,num2);

   switch(opt)
   {
    case 1:System.out.println("add is :"+ add);
          break;
    case 2:System.out.println("sub is :"+ sub);
            break;
    case 3:System.out.println("mul is :"+ mul);
               break;
    case 4:System.out.println("div is :"+ div);
              break;
    }
 }

 public int addition(int num1,int num2)//method with return and parameters
 {
    return (num1+num2);
 }
 public int subtraction(int num1,int num2)//method with return and parameters
 {
    return (num1-num2);
 }
public int multiplication(int num1,int num2)//method with return and parameters
 {
   return (num1*num2);
 }
public int division(int num1,int num2)//method with return and parameters
 {
    return (num1/num2);
 }

}