package OOPConceptPart2;

public class TestCar{

	public static void main(String[] args) {
		
		// static and compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.refuel();
		b.safety();
		
		System.out.println("***********");
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable- dynamic/run time 
		c1.start();
		c1.refuel();
		
		}
	
	   
	
	   
}
