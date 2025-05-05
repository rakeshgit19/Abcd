package Collections;

public class ReverseAStringWithoutChangingItsPosition {

	public static void main(String[] args) 
	{
		String[] str = "rakesh kumar dalai".split(" ");
		
		for(String s:str)
		{
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		
		

	}

}
