package interviewPrograms;

public class MissingNumArr {
	public static void main(String[] args) {

		int[] num = {1, 2,3,4,5,6,8,9};
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

		for (int k = 1; k <=num.length+1; k++)

		{
			sum1 = sum1 + k;
		}
		System.out.println(sum1);

		int miss = sum1 - sum;
		System.out.println(miss);

	}
}
