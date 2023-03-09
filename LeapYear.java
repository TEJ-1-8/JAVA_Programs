import java.util.*;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		if((n%100==0 && n%4==0) || n%4==0)
			System.out.println(n+" is a Leap Year.");
		else
			System.out.println(n+" is not a leap year.");
		sc.close();
	}
}