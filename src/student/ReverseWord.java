package student;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a word: ");

		String userword = keyboard.nextLine();

		System.out.print("userword: " + userword);

		char[] userwordarray = new char[userword.length()];

		for (int i = 0; i < userwordarray.length; i++) {
			userwordarray[i] = userword.charAt(i);
		}
		System.out.println();

		System.out.print("userwordarray: " );
		for (int i = 0; i < userwordarray.length; i++) {
			System.out.print(userwordarray[i]);
		}
		System.out.println();

		System.out.print("userwordarray BACKWARDS: " );
		for (int i = userwordarray.length - 1; i >= 0; i--) {
			System.out.print(userwordarray[i]);
		}
		System.out.println();
	}
}
