import java.util.Scanner;

public class PrimeCheck {
	public static void main(String args[]) {

		boolean isTrue= true;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		for (int i = 2; i < num/2; i++) {
			temp=num/i;
			if (num/i==0){
				isTrue=false;
				break;
			}
		}
		
		if (isTrue!=false){
			System.out.println(num + "is a prime number");
		}
		else 
			System.out.println(num + "is not prime number");
	
	}
}