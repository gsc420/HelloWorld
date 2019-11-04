import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {

		String str;
		String temp = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {

			temp = temp + str.charAt(str.length() - 1 - i);

		}
		if (str.equalsIgnoreCase(temp)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
