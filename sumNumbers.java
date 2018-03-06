package Beel;

public class sumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc123x4yz1";
		int sum = 0;
		String tem = "";

		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i)) == true) {
				if (i < len - 1 && Character.isDigit(str.charAt(i + 1))) {
					tem += str.charAt(i);
					System.out.println(tem);

				} else {
					tem += str.charAt(i);
					System.out.println("Else : " + tem);
					sum += Integer.parseInt(tem);
					tem = "";
				}

			}
		}
		System.out.println(sum);

	}

}
