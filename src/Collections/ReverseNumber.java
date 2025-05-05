package Collections;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Integer T = 12345;
		String S = T.toString();
		char[] ch = S.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			
			System.out.print(ch[i]);
		}

	}

}
