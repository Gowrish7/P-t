package ControlStructures;

public class VowelOrNot {

	public static void main(String[] args) throws java.io.IOException {
		char ch = (char)System.in.read();
		ch = Character.toLowerCase(ch);
		System.out.println("aeiouAEIOU".contains(""+ch)?"vowel":"not vowel");
	}

}
