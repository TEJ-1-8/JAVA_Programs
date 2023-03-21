import java.util.*;
class Greater
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    int num1 = sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int num2 = sc.nextInt();
    if(Integer.compare(num1,num2)==-1)
      System.out.println(num2+" is the greater number.");
    else if(Integer.compare(num1,num2)==0)
      System.out.println("Both the numbers are equal.");
    else
      System.out.println(num1+" is the greater number.");
    sc.close();
  }
}