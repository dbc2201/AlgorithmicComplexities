/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:37 AM
 */

package examples;

public class BigO_Factorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * As we can see in the code, the number of step for the loop
     * depend upon the formula n! (n - factorial), Hence we can say that the
     * algorithmic complexity of this method is O(n!).
     */
    public static void showComplexity(int n) {
        for (int i = 0; i < factorial(4); i++) {
            System.out.print("i = " + i + " ");
        }
    }
}
