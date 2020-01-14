/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 14/01/20
 *   Time: 8:27 AM
 */

package examples;

/**
 * This class will show an example for an algorithm that has a time complexity of
 * O(n) - Big Oh of n.
 */
public class BigO_n {
    /**
     * This method "traverses" the input {@param array} and then prints all the values.
     *
     * @param array the input array to print
     */
    public static void printArray(int[] array) {
        /*
         * This for loop will run as many times as the length of the array.
         * So, if we suppose that the length of the array is 'n', then the loop
         * will also run 'n' times.
         * Hence, the complexity O(n)
         * */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
    }
}
