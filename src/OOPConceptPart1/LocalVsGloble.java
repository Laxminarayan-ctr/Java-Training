package OOPConceptPart1;

public class LocalVsGloble {
	
	int age = 10;
	String name = "laxminaryan";

	public static void main(String[] args) {
		int age = 30;
		System.out.println(age);
		LocalVsGloble obj = new LocalVsGloble();
		
		obj.test();
		
		
		}
	public void test()
	{
	int age = 20;
	String name = "mohan";
	System.out.println(age);
	
	
		
	}

}
