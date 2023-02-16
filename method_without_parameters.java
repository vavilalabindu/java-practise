class method_without_parameters
{
 public static void main(String args[])
 {
   System.out.println("hello");
   method_without_parameters obj=new method_without_parameters();//created obj to call non static method
   obj.display();

 }

 public void display()
 {
    System.out.println("welcome");
 }

}