package strings;

public class ReverseStringUsingStringBuffer {

	public static StringBuffer reverseString(String s) {
		StringBuffer result = new StringBuffer(s);

		return result.reverse();

	}

	public static void main(String[] args) {
		System.out.println("Reversed String :" + reverseString("Hello"));

	}

}
