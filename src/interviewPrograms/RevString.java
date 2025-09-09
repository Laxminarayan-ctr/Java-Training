package interviewPrograms;

public class RevString {

	public static void main(String[] args)
	{
		
		String name = "laxminarayan";
		//char rev = ' ';
		
		for(int i=name.length()-1; i>=0; i--)
		{
			char rev =  name.charAt(i);
			System.out.println(rev);
		}
		
		StringBuffer rev1 = new StringBuffer(name);
		 System.out.println(rev1.reverse());
		
		
		
		
		
	}

}
