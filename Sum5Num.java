import java.util.*;
class Sum5Num 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Number "+(i+1)+":");
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum is "+sum);
		sc.close();
	}
}