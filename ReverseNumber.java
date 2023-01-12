package ControlStructures;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		long n=new java.util.Scanner(System.in).nextLong();
		long rev=0;
		while(n!=0)
		{			
			rev = rev*10+(n%10);
			n = n/10;			
		}
		System.out.print(rev);
	}

}
