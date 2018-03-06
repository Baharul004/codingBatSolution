package Beel;

public class sameEndsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 5, 6, 45, 99, 13, 5, 6 };
		// int l = nums.length;
		int len = nums.length - 2;
		// System.out.println(l - len);

		for (int i = 0; i < 2; i++) {
			// for (int j = nums.length - 3; j < nums.length; j++) {
			if (nums[i] == nums[i + len])

				System.out.println(nums[i] + " -> " + nums[i + len]);

			// }

		}

	}

}
