import java.util.Scanner;

public class NewPalindrom {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anem");
		String str  = sc.nextLine();
		String temp="";
		
		for (int i = 0; i < str.length(); i++) {
			
			temp = temp + str.charAt(str.length()-i -1);
			
			//System.out.println(temp);
			
		}
		
		if (temp.equals(str)) {
			
			System.out.println("is a palindrom");
			
		} else {
			System.out.println("not is a palindrom");
		}

	}

}
