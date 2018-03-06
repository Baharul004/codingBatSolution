package Beel;

public class centeredAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 5, 4, 100 };

		int len = nums.length;
		// System.out.println(len / 2);
		int xoddAvg = 0;

		for (int i = 0; i < len; i++) {

			if (len % 2 != 0) {
				int oddAvg = len / 2;
				xoddAvg = nums[oddAvg];
				// System.out.println(xoddAvg);

			} else {
				int evenAvg = len / 2;
				int evenAvgg = evenAvg - 1;
				xoddAvg = (nums[evenAvg] + nums[evenAvgg]) / 2;

			}
		}
		System.out.println(xoddAvg);

	}

}
