package classes;

/**
 * classes.StringUtils class
 *
 * @author David Kariuki
 * @apiNote - This class contains a string reverse method
 * @since 12/7/2022
 */
public class StringUtils {

	/**
	 * Method to reverse passed string
	 *
	 * @param input - String
	 * @return String
	 */
	public static String reverse(String input) {

		// Check for null
		if (input == null) {
			return null;
		}

		// Check string length
		if (input.length() == 0) {
			return "";
		}

		char[] charArray = input.toCharArray();
		int start = 0;
		int end = charArray.length - 1;

		// Loop while reversing String
		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}

		return new String(charArray); // Return reversed string
	}
}
