
public class TestString {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Chandel");
		sb.append("test SB");
		System.out.println(sb);

		StringBuilder sl = new StringBuilder("Singh");
		sl.append("  test SL");
		System.out.println(sl);

		String str = new String("Singh");
		str.concat("Gaurav");
		System.out.println(str);

	}

}
