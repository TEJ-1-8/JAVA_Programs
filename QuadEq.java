import java.util.*;
class QuadEq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a = sc.nextDouble();
		System.out.println("Enter value of b:");
		double b = sc.nextDouble();
		System.out.println("Enter value of c:");
		double c = sc.nextDouble();
		double d = (b*b)-(4*a*c);
		if(d>0)
		{
			double r1 = (-b+Math.pow(d,0.5))/2*a;
			double r2 = (-b-Math.pow(d,0.5))/2*a;
			System.out.println("The roots are real.");
			System.out.println("The roots are "+r1+" and "+r2+".");
		}
		else if(d==0)
		{
			double r1 = (-b)/2*a;
			System.out.println("The root is "+r1+".");
		}
		else
		{
			System.out.println("The roots are imaginary.");
		}
		sc.close();
	}
}
