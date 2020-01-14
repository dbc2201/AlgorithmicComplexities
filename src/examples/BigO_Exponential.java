/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:37 AM
 */

package examples;

public class BigO_Exponential {
    /**
     * This method runs 2^n times for every input,
     * for example, if the value of n was 4, it would run 16 times
     * but if the value of n was 0, it would still run, but only 1 times.
     * Hence we can see that the number of iteration depend upon the formula
     * 2^n, hence the complexity of this algorithms is O(2^n),
     * We can change this to a more general time, by replacing the 2 in the Math.pow(2, n)
     * to a 'k', then the complexity of this algorithm would be O(k^n).
     */
    public static void showComplexity(int n) {
        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.print("i = " + i + " ");
        }
    }
}
