package list;

import java.util.Arrays;

public class Char__String_7 {
	public static void charToString(char ch) {

		String s = Character.toString(ch);

		System.out.println("The string is: " + s);
	}
	public static void charArrayToString(char[] ch) {
		String s = String.valueOf(ch);
		System.out.println("The string is: " + s);
	}
	public static void StringToChar(String s) {
		char[] chars = s.toCharArray();
		System.out.println(Arrays.toString(chars));
	}
	public static void main(String[] args) {
		charToString('c');
		charArrayToString(new char[]{'a','b','c'});
		StringToChar("Name");

	}
}
