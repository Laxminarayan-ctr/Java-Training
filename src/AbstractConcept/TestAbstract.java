package AbstractConcept;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HdfcBank hf = new HdfcBank();
		hf.loan();
	    Bank.credit();
	    hf.intrest();
	    hf.debit();
	    hf.save();
	    
	    
	    Bank B = new HdfcBank(); // here we can not call child class method bcoz hare child class object is referring parent class refernce veriable
	    B.debit();
	    B.loan();
	    B.intrest();
	    
	    

	}

}
