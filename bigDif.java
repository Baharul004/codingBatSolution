package Beel;

public class bigDif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 15, 10, 3, 25, 5, 6, 20 };
		int max = nums[0];
		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int tmax = Math.max(nums[i - 1], nums[i]);

			if (tmax > max) {
				max = tmax;
			}
			int tmin = Math.min(nums[i - 1], nums[i]);
			if (tmin < min) {
				min = tmin;
			}

		}
		System.out.println("min -> " + min);
		System.out.println("max -> " + max);

	}

}
