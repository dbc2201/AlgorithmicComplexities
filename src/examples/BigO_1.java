/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:34 AM
 */

package examples;

public class BigO_1 {
    /**
     * This method does take an input, but the number of steps taken by the
     * method does not depend upon the value of the input.
     * Hence, we can say, that is will always take the same (constant) amount of time
     * to run for different values.
     * Hence, the complexity of this method is O(1).
     */
    public static void checkEvenOrOdd(int n) {
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
    }
}
