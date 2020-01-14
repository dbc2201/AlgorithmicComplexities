/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:35 AM
 */

package examples;

public class BigO_nlogn {
    public static void showComplexity(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 8; j = j * 2) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
