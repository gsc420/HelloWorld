import java.util.Scanner;

public class ChkPalindrome2 {

	public static void main(String[] args) {

	
		String str= "";
		String temp= "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		str= sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {

			temp = temp + str.charAt(str.length()-i-1);
		}
		
		if (str.equalsIgnoreCase(temp)) {
			System.out.println("is a palindrome");
			
		} else {
			System.out.println("is not palindrome");
		}
	
	}
}
