package interviewPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber k = new PrimeNumber();
		k.Prime();

	}
	
    void Prime()
	{
	int p = 13;
	for(int i=2;p>=i;i++)
	{
		if(p%i==0)
		{
		System.out.println("Not prime");	
		 break;
		}
		
	}
	}
	}


