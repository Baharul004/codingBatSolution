package Beel;

public class isEverywhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i = 11; i < 21; i++) {
			if (i == 12 || i == 17) {
				continue;

			}
			System.out.print(i + " ; ");

		}
		// System.out.println(Arrays.toString(nums));

	}

}
