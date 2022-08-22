package InterFace;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
	    hs.carloan();
	    hs.mutualfund();
	    
	    USBank US =new HSBCBank(); //child class object can be referred by parent interface reference veriable
	    US.credit();
	    US.debit();
	    US.transferMoney();
	   
	   
		

	}

}
