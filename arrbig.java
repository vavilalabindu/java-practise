import java.util.Scanner;
class arrbig
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
 
 int big=arr[0];
for(int i=0;i<arr.length;i++)
{
 if(arr[i]>big)
{
big=arr[i];
}
 }
System.out.println("the biggest number is"+big);
 

}
}  