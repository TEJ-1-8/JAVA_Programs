import java.util.*;
class Calculator
{
  public static void main(String[] main)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    int a = sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int b = sc.nextInt();
    Arithmetic obj1 = new Arithmetic(a,b);
    System.out.print("\nEnter 1 for Addition\nEnter 2 for Subraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter 5 for Power");
    System.out.print("\nEnter your choice: ");
    int op = sc.nextInt();
    switch(op)
    {
      case 1:
        int sum= obj1.sum(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
        break;
      case 2:
        int  diff= obj1.diff(a,b);
        System.out.println("Difference of "+a+" and "+b+" is "+diff);
        break;
      case 3:
        int prod= obj1.mul(a,b);
        System.out.println("Product of "+a+" and "+b+" is "+prod);
        break;
      case 4:
        float quo= obj1.div(a,b);
        System.out.println("Quotient of "+a+" and "+b+" is "+quo);
        break;
      case 5:
        double power = obj1.power(a,b);
        System.out.println("Power of "+a+" and "+b+" is "+power);
        break;
    }
  }
}
class Arithmetic
{
  int num1,num2;
  Arithmetic(int x, int y) //Constructor
  {
    this.num1=x;
    this.num2=y;
  }
  public int sum(int num1,int num2)
  {
    return num1+num2;
  }
  public int diff(int num1,int num2)
  {
    return num1-num2;
  }
  public int mul(int num1,int num2)
  {
    return num1*num2;
  }
  public float div(float num1,float num2)
  {
    return num1/num2;
  }
  public double power(int num1,int num2)
  {
    return Math.pow(num1,num2);
  }
}