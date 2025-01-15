package interviewPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "@#$%^&u8ujhh(**&";
		
		String value = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(value);
		
	}

}
