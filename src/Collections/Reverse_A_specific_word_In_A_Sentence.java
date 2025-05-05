package Collections;

public class Reverse_A_specific_word_In_A_Sentence 
{
	


	public static void main(String[] args) 
	{
		String[] s = "this is my book".split(" ");
		String lastword = s[s.length-1];
		StringBuilder sb = new StringBuilder(lastword).reverse();
		System.out.println(sb);
	}

}
