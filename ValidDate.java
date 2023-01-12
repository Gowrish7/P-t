package ControlStructures;
import java.util.*;
public class ValidDate {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String sdate = new java.util.Scanner(System.in).nextLine();
		StringTokenizer st = new StringTokenizer(sdate,"/");
		int dd = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		int yy = Integer.parseInt(st.nextToken());
		if(dd<=0 || mm <=0 || yy<=0)
		{
			System.out.println("Invalid");
					
		}
		
		if((dd<=31 && mm ==1) ||(dd<=29 && mm==2)|| (dd<=31 && mm ==3) || (dd<=30 && mm ==4) || (dd<=31 && mm ==5)|| (dd<=30 && mm ==6)|| (dd<=31 && mm ==7)|| (dd<=31 && mm ==8)|| (dd<=30 && mm ==9)|| (dd<=31 && mm ==10)|| (dd<=30 && mm ==11)|| (dd<=31 && mm ==12)) {
			System.out.println("valid");
		}
		else if((dd>29 && mm==2)){
			System.out.println("invalid");
		}
		else {
			System.out.println("invalid");
		}
	}
}
