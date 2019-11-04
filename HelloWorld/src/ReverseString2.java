
public class ReverseString2 {
	public static void main(String[] args) {
		String input = "Geeks for Geeks";

		// getBytes() method to convert string
		// into bytes[].
		byte[] str = input.getBytes();

		byte[] result = new byte[str.length];

		// Store result in reverse order into the
		// result byte[]
		for (int i = 0; i < str.length; i++)
			result[i] = str[str.length - i - 1];

		System.out.println(new String(result));
	}
}