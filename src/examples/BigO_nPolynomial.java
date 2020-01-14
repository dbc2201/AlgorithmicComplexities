/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:36 AM
 */

package examples;

public class BigO_nPolynomial {
    private static int[][] twoDimensionalArray = new int[3][3];

    public static void printTwoDimensionalArray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(twoDimensionalArray[i][j]);
            }
        }
    }
}
