import java.util.*;
class greatest
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		System.out.println("Enter the number:");
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.print("Greatest number is:"+a);
		else if(b>a && b>c)
			System.out.print("Greatest number is:"+b);
		else
			System.out.print("Greatest number is:"+c);
	}
}