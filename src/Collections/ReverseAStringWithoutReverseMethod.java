package Collections;

public class ReverseAStringWithoutReverseMethod {

	public static void main(String[] args) 
	{


		String[] str = "rakesh kumar".split("");
		//char[] ch = str.toCharArray();
		for (int i =str.length-1; i>=0; i--) 
		{
			System.out.print(str[i]); 
		}

	}

}
