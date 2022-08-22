package OOPConceptPart1;

public class Car {
	
	//Class variable
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2012;
		a.wheel= 4;
		
		b.mod = 2013;
		b.wheel = 4;
		
		c.mod = 2015;
		c.wheel = 4;
		
		System.out.println(c.mod);

	}

}
