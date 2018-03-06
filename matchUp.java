package Beel;

public class matchUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 3, 10 };
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			for (int j = i; j <= i; j++) {
				// System.out.println(nums1[i] + " -> " + nums2[j]);
				int dif = Math.abs(nums1[i] - nums2[j]);
				if (dif < 3)
					count++;

			}

		}
		System.out.println(count);

	}

}
