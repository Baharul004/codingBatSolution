package Beel;

public class haveThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 3, 1, 3 };

		int count = 0;

		for (int i = 0; i < nums.length - 3; i++) {
			if (nums[i] == 3 && nums[i + 2] == 3 && nums[i + 4] == 3)
				count++;

		}
		// if(count == 3) {
		// for (int i = 0; i < nums.length; i++) {
		// if()
		//
		// }
		// }
		System.out.println(count);

	}

}
