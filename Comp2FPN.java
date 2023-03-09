import java.util.*;
class Comp2FPN
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    Float n1=sc.nextFloat();
    System.out.println("Enter 2nd number:");
    Float n2=sc.nextFloat();
    Float res1=n1,res2=n2;
    res1*=1000;
    res1%=1000;
    res2*=1000;
    res2%=1000;
    if(res1.compareTo(res2)==0)
      System.out.println(n1+" and "+n2+" are equal upto 3 Decimal places");
    else
      System.out.println(n1+" and "+n2+" are not equal upto 3 Decimal places");
  }
}