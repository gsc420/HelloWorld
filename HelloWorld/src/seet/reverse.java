package seet;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = sc.nextLine();
		String temp = "";
		
		for (int i = 0; i < str.length(); i++) {

			temp =  temp + str.charAt(str.length()-i - 1);
		}
		System.out.println(temp);
	}

}
