/**
 * AdditionTestInput class
 *
 * @author David Kariuki
 * @see ParameterResolverExtension
 * @see ParameterResolverExtensionTest
 * @since 10/8/2022
 */

package extensions;

public class AdditionTestInput {

    private final int input1;
    private final int input2;

    /**
     * Class constructor
     *
     * @param input1 - int
     * @param input2 - int
     */
    public AdditionTestInput(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    /**
     * Getter method
     *
     * @return int
     */
    public int getInput1() {
        return input1;
    }

    /**
     * Getter method
     *
     * @return int
     */
    public int getInput2() {
        return input2;
    }
}
