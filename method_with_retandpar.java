class method_with_retandpar
{
 public static void main(String args[])
 {
   System.out.println("hello");
   method_with_retandpar obj=new method_with_retandpar();//created obj to call non static method
   int add= obj.addition(5,2);//returned value is stored in add(variable)
   obj.subtraction(5,2);
    System.out.println("add is : "+ add);
 }

 public int addition(int a,int b)//method with return and parameters
 {
    return (a+b);
 }
 public void subtraction(int a,int b)//method with parameters
 {
    System.out.println("subtraction is : "+ (a-b));
 }

}