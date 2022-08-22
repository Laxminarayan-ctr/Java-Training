package OOPConceptPart1;

public class CallByValueCallByRef {
	int a=50;
	int b=60;

	public static void main(String[] args) {
	
		CallByValueCallByRef obj = new CallByValueCallByRef();
		
		 int a = 10;
		 int b = 20;
		 obj.test(a, b); // Call by value OR pass by value
		 
		 
		
			/*
			 * obj.a = 50; obj.b = 60;
			 */
		 obj.swap(obj);
		 System.out.println("value of a="+obj.a);
		 System.out.println("value of b="+obj.b);
		

	}
	public void test(int a, int b)
	{
		a =40;
		b =30;
		int c = a+b;
		System.out.println(c);
		
	}
	
	// Call by reference
	public void swap(CallByValueCallByRef t)
	{
		int temp = t.a;
		t.a = t.b;
		t.b = temp;
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		
	}

}
