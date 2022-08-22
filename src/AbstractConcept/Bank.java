package AbstractConcept;

public abstract class Bank {
	
  public abstract void loan();
  public abstract void intrest();
	
	
	
	public static void credit() {
		
		System.out.println("this is static methos");
	}
	
	public void debit()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args)
	{
		
		credit();
	}
	
	 
}
