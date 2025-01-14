package interviewPrograms;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Laxminarayan";
		char rev = ' ';
		System.out.println(name.length());
		
		for(int i=name.length()-1; i>=0; i--)
		{
			 
			  rev =  name.charAt(i);
			  System.out.println(rev);
		}
		
		
		StringBuffer revs = new StringBuffer(name);
		 System.out.println(revs.reverse());

	}

}
