/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:36 AM
 */

package examples;

public class BigO_nPolynomial {
    private static int[][] twoDimensionalArray = new int[3][3];

    /**
     * As we can see, both the loops run n times, hence both of them have a
     * complexity of O(n), so when we multiply these complexities together we get,
     * O(n x n) OR O(n^2).
     * It would be true for any number of nested loops, if we add another loop inside
     * the 'j' loop that also runs 'n' times, then the total complexity of this
     * algorithm would be O(n^3)
     */
    public static void printTwoDimensionalArray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(twoDimensionalArray[i][j]);
            }
        }
    }
}
