package OOPConceptPart1;

public class StaticNonStatic {
	String name = "laxmi"; // Non static variable
	static int age = 10; // static variable

	public static void main(String[] args) {
		sum();
		StaticNonStatic.sum();

		StaticNonStatic ob = new StaticNonStatic();
		ob.sendMail();
		System.out.println(ob.divsion(10, 2));
		

	}

	public void sendMail() // non static
	{
		System.out.println("send mail");
		StaticNonStatic obj = new StaticNonStatic();
		System.out.println(obj.name);

	}

	public static void sum() // static method
	{
		System.out.println("sum method");
		System.out.println(age);

	}
	
	
	public int divsion(int x, int y) {
		 System.out.println("division method");
		 int z = x/y;
		 return z;
	}

}
