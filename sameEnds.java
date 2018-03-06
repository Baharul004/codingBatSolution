package Beel;

public class sameEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "javajava";

		int len = string.length();
		String str = "";

		int half = len / 2;
		for (int i = 0; i <= half; i++) {
			String f = string.substring(0, i);
			for (int j = len; j >= half; j--) {
				String l = string.substring(j, len);
				if (l.equals(f))
					str = l;

			}
		}
		System.out.println(str);
	}

}
