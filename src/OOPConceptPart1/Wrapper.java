package OOPConceptPart1;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x  = "20";
		System.out.println(x+20);
        
		// Data conversion from string to integer 
		int i = Integer.parseInt(x);
		System.out.println(i);
		int a = 20;
		System.out.println(a+i);
		System.out.println(x);
		
		String d = "33.33";
		System.out.println(d+10);
	    double b = Double.parseDouble(d);
	    System.out.println(b+10);
	    
	    
	    int k = 20;
	    System.out.println(k+20);
	    
	    // int to string
	    String s = String.valueOf(k);
	    System.out.println(s+20);
	    
	    String s1 = "100a";
	    int s2 = Integer.parseInt(s1);
	    System.out.println(s2+100);
	    
       
				
	}

}
