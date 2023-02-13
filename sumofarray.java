import java.util.Scanner;
class sumofarray
{
public static void main(String args[])
{
int sum=0;
 Scanner bs=new Scanner(System.in);
 System.out.println("enter num of elements in array");
 int ns=bs.nextInt();

 int arr[]=new int[ns];
 System.out.println("enter array values");
 for(int i=0;i<ns;i++)//traditionalfor
 {
   arr[i]=bs.nextInt();
   sum=sum+arr[i];
 }

System.out.println("sum of arrays is "+sum);
}
}  