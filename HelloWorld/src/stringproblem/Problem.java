package stringproblem;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t = "";
		int cnt = 0;
		boolean x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your word");
		t = sc.nextLine();
		char[] inp = t.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < t.length(); i++) {
			for (int j = i + 1; j < t.length(); j++) {
				if (inp[i] == inp[j]) {
					System.out.println(inp[j]);
					cnt++;
					break;
				}
			}

		}
	}
}