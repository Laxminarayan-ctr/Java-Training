 package InterFace;

public class HSBCBank implements USBank,Brazil {
	
	public void credit()
	{
		System.out.println("HSB -- credit");
	}
	
	public void debit()
	{
		System.out.println("HSB -- debit");
	}
	
	public void transferMoney()
	{
		System.out.println("HSB -- transefer");
	}
	
	public void educationLoan()
	{
		System.out.println("Education loan");
	}
	
	public void carloan()
	{
		System.out.println("car laon");
	}
     
    public void mutualfund()
    {
    	System.out.println("it is brazil bank ");
    }
}
 