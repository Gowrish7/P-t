package ControlStructures;

public class StringPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =new java.util.Scanner(System.in).nextLine();
		int len = str.length();
		for(int i=1;i<=len;i++)
			System.out.printf("%"+len+"."+i+"s"+"%-"+len+"."+i+"s\n",str,str);
		for(int i=1;i<=len;i++)
			System.out.printf("%-"+len+"."+i+"s"+"%"+len+"."+i+"s\n",str,str);
//		for(int i=1;i>=len;i++)
//			System.out.printf("%-"+len+"."+i+"s"+"%"+len+"."+i+"s\n",str,str);
	}
}
