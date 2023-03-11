import java.util.Scanner;
class SumAvg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Number "+(i+1)+":");
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+sum/n);
		sc.close();
	}
}