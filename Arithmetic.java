import java.util.*;
class Arithmetic
{
  public static void main(String[] main)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    int a = sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int b = sc.nextInt();
    System.out.print("\nEnter 1 for Addition\nEnter 2 for Subraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter 5 for Power");
    System.out.print("\nEnter your choice: ");
    int op = sc.nextInt();
    switch(op)
    {
      case 1:
        int sum= sum(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
      case 2:
        int  diff= diff(a,b);
        System.out.println("Difference of "+a+" and "+b+" is "+diff);
      case 3:
        int prod= mul(a,b);
        System.out.println("Product of "+a+" and "+b+" is "+prod);
      case 4:
        float quo= div(a,b);
        System.out.println("Quotient of "+a+" and "+b+" is "+quo);
      case 5:
        double power = power(a,b);
        System.out.println("Power of "+a+" and "+b+" is "+power);
    }
  }
  public static int sum(int x, int y)
  {
    return x+y;
  }
  public static int diff(int x, int y)
  {
    return x-y;
  }
  public static int mul(int x, int y)
  {
    return x*y;
  }
  public static float div(float x, float y)
  {
    return x/y;
  }
  public static double power(int x, int y)
  {
    return Math.pow(x,y);
  }
}