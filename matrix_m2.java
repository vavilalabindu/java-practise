import java.util.Scanner;
class matrix_m2
{
public static void main(String args[])
{
 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter num of rows");
 int rows=sc.nextInt();
 System.out.println("enter num of cols");
 int cols=sc.nextInt(); 

int arr[][]=new int[rows][cols];

System.out.println("enter array values");
  for(int i=0;i<rows;i++)//to read array values
   {
    for(int j=0;j<cols;j++)
      {
       arr[i][j]=sc.nextInt();
      }
       
    }


System.out.println("the array values are : ");
   for(int i=0;i<rows;i++)//to print array values
   {
    for(int j=0;j<cols;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
       System.out.println();
    }



}


}