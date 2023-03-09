import java.util.*;
class SumofMatrix
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[][] matrix1=new int[3][3];
    int[][] matrix2=new int[3][3];
    int[][] sum=new int[3][3];
    int i,j;
    System.out.println("Enter first matrix:");
    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
      {
        System.out.println(String.format("Enter matrix1[%d][%d]:",i,j));
        matrix1[i][j]=sc.nextInt();
      }
    System.out.println("Enter second matrix:");
    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
      {
        System.out.println(String.format("Enter matrix2[%d][%d]:",i,j));
        matrix2[i][j]=sc.nextInt();
      }
    //Sum of 2 Matrices
    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
      {
        sum[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    System.out.println("First Matrix:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.print(matrix1[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println("Second Matrix");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.print(matrix2[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println("Sum of 2 Matrices:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.print(sum[i][j]+"\t");
      }
      System.out.println();
    }
  }
}