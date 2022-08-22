package OOPConceptPart2;

public class ConstructorConcept {
	
	String name;
	int age;
	
	
	public ConstructorConcept(String name, int age)
	{
		this.age=age; //referring the class variable
		this.name=name;
		System.out.println("Client name is="+name);
		System.out.println("client age is="+age);
	}
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	ConstructorConcept c1 = new ConstructorConcept("laxmi",20);

		
	}

}
