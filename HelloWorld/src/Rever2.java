
public class Rever2 {

	public static void main(String[] args) {

		String str = "Gaurav Singh Chandel";
		
		String temp="";
		
//		for (int i = str.length()-1; i >= 0; i--) {
//			
//			temp = temp +str.charAt(i);
//			
//		}
		
		for (int i = 0; i < str.length(); i++) {
			
			temp=temp + str.charAt(str.length()-i-1);
			
		}
		System.out.println(temp);
		
	}

}
