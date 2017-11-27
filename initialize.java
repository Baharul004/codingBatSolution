package first;
//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class initialize {
	static Scanner scan1 = new Scanner(System.in);
	//static Scanner scan2 = new Scanner(System.in);
	static int B = scan1.nextInt();
	static int H = scan1.nextInt();
	static boolean flag = true;
	static {
		try {
	if(B <=0 || H <= 0) {
		flag = false;
		throw new Exception("Breadth and height must be positive");
		
	}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag) {
			int area = B *H ;
			System.out.println(area);
		}

	}

}
