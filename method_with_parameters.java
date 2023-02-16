class method_with_parameters
{
 public static void main(String args[])
 {
   System.out.println("hello");
   method_with_parameters obj=new method_with_parameters();//created obj to call non static method
   obj.add(5,2);
   obj.sub(5,2);
 }

 public void add(int a,int b)
 {
    System.out.println("addition is : "+ (a+b));
 }
 public void sub(int a,int b)
 {
    System.out.println("subtraction is : "+ (a-b));
 }

}