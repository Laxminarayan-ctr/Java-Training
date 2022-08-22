package OOPConceptPart2;

public class BMW extends Car{
	
	
	//Method overriding-:having the function with the same name with same number of argument in different class 
	public void start() { //Overridden method
		System.out.println("start the BMW");
	}
	
	public void safety()
	{
		System.out.println("BMW -- Safity");
	}
	
}
