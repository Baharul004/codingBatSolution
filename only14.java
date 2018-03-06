package Beel;

public class only14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 4, 1, 4 };
		// int[] nums = { 1, 4, 1, 4 };
		boolean t = true;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4)
				t = false;

		}
		System.out.println("True : " + t);

	}

}
