class varargs
{
 public static void main(String args[])
 {
   addition(5,2,2,9);

 }
 public static void addition(int ...a)
 {
    int sum=0;
    for(int i:a)
    {
        sum=sum+i;
    }
    System.out.println("the addition is "+sum );

 }


}