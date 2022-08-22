package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		
		//Comparison operator
		// > < <= >= == !=
		
		
	

		int a = 12;
		int b = 12;
		if(a<b) {
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
		
		int x = 150;
		int y = 180;
		int z = 130;
		
		if(x>z & x>y) {
			System.out.println("x is greater");
		}
		else if(y>z) {
			
			System.out.println("y is greate");
		}
		else {
			System.out.println("z is greater");
		}
		
	}

}
