package Beel;

public class modThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 9, 7, 1, 2, 9, 2, 2, 6 };

		int odd = 0;
		int even = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			System.out.print(nums[i]);
			if (nums[i] % 2 == 0) {
				if (nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
					even++;
			} else {
				if (nums[i] % 2 != 0) {
					if (nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)
						odd++;
				}
			}

		}
		System.out.println("Even " + even + " Odd " + odd);

	}

}
