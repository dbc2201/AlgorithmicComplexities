/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:35 AM
 */

package examples;

public class BigO_logn {
    public static void printValues(int n) {
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("i = " + i);
        }
    }
}
