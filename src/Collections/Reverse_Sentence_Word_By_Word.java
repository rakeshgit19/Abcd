 package Collections;

public class Reverse_Sentence_Word_By_Word 
{

	public static void main(String[] args) 
	{
		String[] s = "you love me".split(" ");
		for (int i =s.length-1; i>=0; i--) 
		{
			System.out.print(s[i]+" ");
		}

	}

}
