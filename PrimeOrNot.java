package ControlStructures;

//import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int n=new java.util.Scanner(System.in).nextInt();
		if(n>0)
		{
			if(n==1)
			{
				System.out.println("Neither prime nor composite");
			}
			else
			{
				for(int i=2;i<=Math.sqrt(n);i++)
				{
					if(n%2==0)
					{
						System.out.println("not prime");
						System.exit(0);
					}
				}
				System.out.println("prime");
			}
		}
		else
		{
			System.out.println("invalid");
		}
	}
}

