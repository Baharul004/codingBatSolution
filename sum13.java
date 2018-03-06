package Beel;

import java.util.Arrays;

public class sum13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 2, 1 };
		int len = nums.length;
		int index = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			// System.out.println(i);
			if (nums[i] == 13 && i != len - 1) {
				index = i;
				nums[i] = 0;
				nums[i + 1] = 0;

			} else {
				if (nums[i] == 13 && i == len - 1) {
					nums[i] = 0;
				}
			}
		}
		System.out.println(index);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}

}
