package org.univ;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String original = s.next();
		int len = original.length();
		String reverse = "";
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse of string: " + reverse);
		System.out.println("success");
	}

}
