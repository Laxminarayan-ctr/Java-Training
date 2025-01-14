package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum(20);
		sum("laxmi");
		
	

	}
	
	public static void sum(String k)
	{
		System.out.println("String Method "+k);
	}
	public void sum(int k)
	
	{
		System.out.println("integer method"+k);
	}

}
