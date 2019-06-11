// Write a program to insert "tekarch" into vector then insert user input number(N)
// of Z's from 3rd position. Delete N characters from 6th position from vector

import java.util.Scanner;
import java.util.Vector;

public class InserElement {

	public static String insertElement(String str, int num, String insertChar, int index ) {

		Vector<String> v = new Vector<String> ();

		v.add(str);

		String[] str1 = str.split("");

		for (int i = 0; i < str1.length; i++) {
			v.add(str1[i]);
		}

		v.remove(0);

		for (int i = 1; i <= num; i++) {
			v.insertElementAt(insertChar, index);
		}

		for (int i = 1; i <= num; i++) {
			v.remove(6);
		}

		String result = "";
		for (int i = 0; i < v.size(); i++) {
			result = result + v.get(i);
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scan.next();

		System.out.println("Enter the number of times you want to insert a character");
		int num = scan.nextInt();

		System.out.println("Enter index position");
		int index = scan.nextInt();

		System.out.println("Enter the charater you want to insert");
		String insertChar = scan.next();

		System.out.println(insertElement(str, num, insertChar, index));
	}
}
