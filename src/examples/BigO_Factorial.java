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

    public static void showComplexity(int n) {

    }
}
