package interviewPrograms;

public class SmallNumLarg {

	public static void main(String[] args) {

		int num[] = { 2, 4, 6, 2, 7, 10 };
		int largest = num[0];
		int smallest = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			} else if (num[i] < smallest) {
				smallest = num[i];
			}

		}
		System.out.println(largest);
		System.out.println(smallest);

	}

}
