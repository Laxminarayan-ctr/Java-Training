package JavaBasic;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		
		String x = "hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b); //300
		
		System.out.println(x+y); //helloWorld
		
		System.out.println(a+b+x+y); // 300helloWorld
		
		System.out.println(x+y+a+b); // helloWorld100200
		
		System.out.println(x+y+(a+b)); // helloWorld300
		
		System.out.println(a+b+x+y+a+x+b+y); //300helloWorld100hello200World
		
		System.out.println(a+b+x+y+a+b); //300helloWorld100200
		
		System.out.println(x+y); //22.66
		
		System.out.println("the value of a:"+a);
		System.out.println("the sum of a and b:"+(a+b));
		System.out.println(x+" "+c+" "+d);

	}

}
