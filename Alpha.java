import java.util.*;
class Alpha
{
  public static void main(String[] main)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Character:");
    char ch = sc.next().charAt(0);
    if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
      System.out.println(ch+" is an Alphabet.");
    else
      System.out.println(ch+" is not an Alphabet.");
  }
}