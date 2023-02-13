import java.util.Scanner;
class arrdivof2
{
public static void main(String args[])
{
 Scanner bs=new Scanner(System.in);
 System.out.println("enter num of elements in array");
 int ns=bs.nextInt();

 int arr[]=new int[ns];
 System.out.println("enter array values");
 for(int i=0;i<ns;i++)//traditionalfor
 {
   arr[i]=bs.nextInt();
 }
 
 System.out.println("divisible by 2 are");
 for(int dummy:arr)//referencedfor
{
if(dummy%2==0)
System.out.println(dummy);
}
 
 

}
}  