package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array: To store similar data type value in a array variable 
		
		//1. int array:
		//Disadvantage of array
		//Size is fix = Static array   -- TO overcome this problem we use collection - Arraylist,Hashtable
		//Only store similar data type -- TO overcome this problem we use Object array
		
		int i[] = new int[4];
		   i[0] = 1;
		   i[1] = 2;
		   i[2] = 60;
		   i[3] = 90;
		   
		   for(int j=0; j<i.length;j++) {
			   System.out.println(i[j]);
		   }
			   
	//Object array is class ->used to store different data type	   
	   Object ob[] = new Object[5];
	   ob[0] = "Tom";
	   ob[1] = 10;
	   ob[2] = 44.22;
	   
	   for(int j=0; j<ob.length;j++)
	   {
		   System.out.println(ob[j]);
	   }
	  
				
				
		
		
		

	}

}
