/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:35 AM
 */

package examples;

public class BigO_nlogn {
    /**
     * In this method, we can see that the first loop would be running
     * n times, hence the complexity of that loop is O(n)
     * But, the second loop is running only logn times, hence its complexity is
     * O(logn)
     * To calculate the total complexity of this algorithm, we will multiply the
     * two complexities together
     * Hence, we achieve O(n x logn) OR O(nlogn)
     */
    public static void showComplexity(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 8; j = j * 2) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
