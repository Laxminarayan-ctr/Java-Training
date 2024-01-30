	package OOPConceptPart1;

public class Function {

	public static void main(String[] args) {
		Function obj = new Function();
		String k = obj.name();
		obj.test();
		int dd = obj.devision(30,10);
		int l = obj.pqr();
		System.out.println(l);
		System.out.println(k);
		System.out.println(dd);
				
		//  

	}
	// Non static method
	public void test()
	{
		System.out.println("test method");
	}
	public int pqr()
	{
		int a = 20;
		int b = 30;
		int c = 15;
		
		return c;
	}
	public  String name() {
		String namee = "laxmi";
		String name = "laxminarya";
		System.out.println(namee);
		return name;
		}
	public int devision(int a, int y)
	{
		int d = a/y;
		return d;
	}
	
	

}
