package Beel;

import java.util.Arrays;

public class centeredAveragefinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 100, 0, 5, 3, 4 };
		int len = nums.length - 2;
		int sum = 0;
		int max = nums[0];
		int min = nums[0];
		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 1; i < nums.length; i++) {
			int tmax = Math.max(nums[i], nums[i - 1]);
			if (tmax > max) {
				max = nums[i];
				maxIndex = i;
			} else {
				int tmin = Math.min(nums[i], nums[i - 1]);
				if (min > tmin) {
					min = tmin;
					minIndex = i;
				}
			}
		}

		for (int i = minIndex; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];

		}
		for (int i = maxIndex; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];

		}

		System.out.println(max + " Max index " + maxIndex);
		System.out.println(min + " Min index " + minIndex);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length - 2; i++) {
			sum += nums[i];

		}
		System.out.println(sum / len);

	}

}
