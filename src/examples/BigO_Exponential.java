/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:37 AM
 */

package examples;

public class BigO_Exponential {
    public static void showComplexity(int n) {
        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.print("i = " + i + " ");
        }
    }
}
