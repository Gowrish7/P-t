package ControlStructures;
import java.util.*;
public class PosNegZero {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float a=sc.nextInt();
//		if(a==0)
//		{
//			System.out.println("Zero");
//		}
//		else if(a>0)
//		{
//			System.out.println("Positive");
//		}
//		else
//		{
//			System.out.println("Negative");
//		}
//	}
//}


	System.out.println(a>0?"positive":a<0?"negative":"zero");
	
	}
}