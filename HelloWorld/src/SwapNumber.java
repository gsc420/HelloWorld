
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10; int b=7;
		/*a = a*b;
		b=a/7;
		a=a/b;
		System.out.println("value of a after swaping"+" " +a);
		System.out.println("value of b after swaping"+ " "+b);
		*/
		a=a+b;//17
		b=a-b;//17-7=10
		a=a-b;//17-10=7
		System.out.println("value of a after swaping"+" " +a);
		System.out.println("value of b after swaping"+ " "+b);

	}

}
