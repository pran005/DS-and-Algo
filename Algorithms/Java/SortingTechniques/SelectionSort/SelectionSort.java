package SortingTechniques.SelectionSort;

import java.util.Scanner;

/************ Sorting Algorithm : Selection Sort **********************
 *
 * #GENERAL:
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning.
 * The algorithm maintains two sub-arrays in a given array:
 *      1) The sub-array which is already sorted.
 *      2) Remaining sub-array which is unsorted.
 *
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted sub-array is picked
 * and moved to the sorted sub-array.
 *
 * #COMPARISONS:
 * No. of passes = (n-1)
 * No. of comparisons = 1 + 2 + 3+.....n-1= n(n-1)/2 [O(n^2)]
 * No. of swaps = 1 + 2 + 3 +......n-1 = n(n-1)/2 [O(n^2)]
 *
 * #TIME/SPACE COMPLEXITIES:
 * Worst Case Time Complexity : O(n^2) [^ => Exponentiation]
 * Best Case Time Complexity : O(n^2)
 * Auxiliary Space: O(1) [Since No Extra Space is Used]
 *
 * #NOTE: The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
 *
 *******************************************************************/
public class SelectionSort {

    static void runSelectionSort(int[] array) {
        int arrayLength = array.length;

        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < arrayLength-1; i++)
        {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < arrayLength; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /* Prints the array */
    static void printArray(int[] array) {
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int totalElements = scanner.nextInt();
        int[] array = new int[totalElements];

        System.out.println("Enter array elements:");
        for (int i = 0; i < totalElements; i++) {
            System.out.println("Enter " + i + " element: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Your input array :");
        printArray(array);

        runSelectionSort(array);
        System.out.println("Sorted array");
        printArray(array);
    }
}