package Beel;

public class either24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 4, 1, 2, 2 }; // ans flase
		int two = 0;
		int four = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 2 && nums[i + 1] == 2)
				two++;
			if (nums[i] == 4 && nums[i + 1] == 4)
				four++;

		}
		if (two == four) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}

	}

}
