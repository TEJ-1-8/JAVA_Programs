import java.util.*;
class Weekday
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n=sc.nextInt();
    int res=n%7;
    if(res==1)
      System.out.println("Sunday");
    else if(res==2)
      System.out.println("Monday");
    else if(res==3)
      System.out.println("Tuesday");
    else if(res==4)
      System.out.println("Wednesday");
    else if(res==5)
      System.out.println("Thursday");
    else if(res==6)
      System.out.println("Friday");
    else
      System.out.println("Saturday");
  }
}