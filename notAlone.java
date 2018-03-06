package Beel;

import java.util.Arrays;

public class notAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 1, 2 };

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 2] && nums[i] == nums[i + 1]) {
				nums[i] = nums[i];
				break;
			}

			else if (nums.length > 2 && i < nums.length - 2 && nums[i + 1] == 1) {
				int max = Math.max(nums[i], nums[i + 2]);
				nums[i + 1] = max;
			}
		}
		System.out.println(Arrays.toString(nums));

	}

}
