package ControlStructures;

public class ConsonentOrNot {

	public static void main(String[] args) {
		char ch = new java.util.Scanner(System.in).next().charAt(0);
		if(Character.isLetter(ch) && !"aeiouAEIOU".contains(""+ch))
			System.out.println("consonant");
		else
			System.out.println("not consonant");
	}

}