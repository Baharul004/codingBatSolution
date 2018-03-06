package Beel;

import java.util.Arrays;

public class zeroMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0, 4, 0, 3, 0 };
		int index = 0;
		int second = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {

				index = i;
				int max = 0;
				// System.out.println(index);
				for (int j = index; j < nums.length; j++) {
					// System.out.println(nums[j]);

					if (nums[j] % 2 != 0) {
						second = j;
						// System.out.println(second);
						for (int j2 = second; j2 < nums.length; j2++) {
							if (nums[j2] % 2 != 0) {
								int mmax = Math.max(nums[j], nums[j2]);
								if (mmax > max) {
									max = mmax;
									nums[i] = mmax;

									// System.out.println(max);

								}

							}
						}

					}

				}

			}
		}

		System.out.println(Arrays.toString(nums));
		// System.out.println(second);

	}

}
