import java.util.Scanner;
class matrix_sub
{
public static void main(String args[])
{
 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter num of rows");
 int rows=sc.nextInt();
 System.out.println("enter num of cols");
 int cols=sc.nextInt(); 

int arr[][]=new int[rows][cols];
int brr[][]=new int[rows][cols];
int res[][]=new int[rows][cols];

System.out.println("enter first array values");
  for(int i=0;i<rows;i++)//to read array values
   {
    for(int j=0;j<cols;j++)
      {
       arr[i][j]=sc.nextInt();
      }
       
    }

   System.out.println("enter second array values");
  for(int i=0;i<rows;i++)//to read array values
   {
    for(int j=0;j<cols;j++)
      {
       brr[i][j]=sc.nextInt();
      }
       
    }


  for(int i=0;i<rows;i++)//to store subtraction array values
   {
    for(int j=0;j<cols;j++)
      {
       res[i][j]=arr[i][j]-brr[i][j];
      }
       
    }


System.out.println("the subtraction values are : ");
   for(int i=0;i<rows;i++)//to print subtraction array values
   {
    for(int j=0;j<cols;j++)
      {
        System.out.print(res[j][i]+"\t");
      }
       System.out.println();
    }



}


}