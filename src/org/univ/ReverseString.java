package org.univ;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String original = s.nextLine();

		String[] word = original.split(" ");
		
		String reversedStr = "";
		for (int i = 0; i < word.length; i++) {
			String fisrtwrd = word[i];

			String reverseword = "";
			for (int j = fisrtwrd.length() - 1; j >= 0; j--) {
				reverseword = reverseword + fisrtwrd.charAt(j);
			}
			reversedStr=reversedStr+reverseword+" ";
			
		}
		System.out.println(reversedStr);
	}

}
