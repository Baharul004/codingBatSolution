package Beel;

public class mirrorEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hi and iH";
		int len = string.length();
		String fin = "";
		String tmp1 = "";
		String tmp2 = "";

		for (int i = 0; i < len; i++) {
			tmp1 += string.substring(i, i + 1);
			// System.out.println(tmp1);
			tmp2 = "";
			for (int j = tmp1.length() - 1; j >= 0; j--) {
				tmp2 += tmp1.substring(j, j + 1);
				// System.out.println(tmp2);
				if (tmp2.equals(string.substring(len - i - 1, len)))
					fin = tmp1;
			}
		}
		// return fin;
		System.out.println(fin);
	}
}
