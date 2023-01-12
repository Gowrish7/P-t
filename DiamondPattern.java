package Patterns;

public class DiamondPattern {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = 1; r<=n; r++) {
			for (int c = 1; c<=n; c++) {
//				if ( c==1 || r==1 || c== n || r ==n || c==r || c== n-r)
				if ( c==r || c== n-r)
					System.out.println("DLITHE");
//				else if (r == n/2 && c == 2) {
//					System.out.print("hello world");
//					c+="hello world".length()-1;
//				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
