package classes;

/**
 * classes.OddEven class
 *
 * @author David Kariuki
 * @apiNote - This class contains an even number checker method
 * @since 12/7/2022
 */


public class OddEven {

	/**
	 * Method to check if number is odd or even
	 *
	 * @param number - int
	 * @return boolean
	 */
	public boolean isEven(int number) {
		return number % 2 == 0;
	}
}
