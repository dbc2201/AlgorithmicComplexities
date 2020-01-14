/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:35 AM
 */

package examples;

public class BigO_logn {
    /**
     * If we look closely at the running values of i in this loop,
     * they are 1, 2, 4 (8, but the expression i < n will become false)
     * <p>
     * The number of iterations for this loop can also be determined by the formula
     * log(n)
     * log(8) = 3, which is also the number of times the loop ran.
     * Hence, the complexity O(logn)
     */
    public static void printValues(int n) {
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("i = " + i);
        }
    }
}
