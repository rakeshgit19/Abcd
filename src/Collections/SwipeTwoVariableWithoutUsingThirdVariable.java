package Collections;

public class SwipeTwoVariableWithoutUsingThirdVariable {

	public static void main(String[] args) 
	{
		int x=4; int y=5;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x is= " +x);
		System.out.println("y is= " +y);

	}

}
