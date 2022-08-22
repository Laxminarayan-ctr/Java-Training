package OOPConceptPart1;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyConcept f1 = new FinallyConcept();
		//f1.test1();
		f1.devision();

	}
	
	public void test1() {
	try
	{
		System.out.println("inside test1 method");
		throw new RuntimeException("test");
	}
	
	catch(Exception e) {
		System.out.println("catch block");
		}
    finally
    {
    	System.out.println("this is finaly block");
    }
	}
	
	public void devision()
	{
		int i = 10;
		try
		{
		int r = i/0;
		System.out.println(r);
		}
		catch(NullPointerException E) {
			
			System.out.println("Divide by zero error");
		}
		finally
		{
			System.out.println("final block");
		}
	}
}
