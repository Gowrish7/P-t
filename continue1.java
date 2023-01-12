package breakcontinue;

public class continue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gowrish G Kamath";
				for(int i=0;i<str.length();i++)
				{
					if("aeiou".contains(""+str.charAt(i)))
						continue;
				System.out.print(str.charAt(i));
	}

	}
}
