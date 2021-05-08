package SortingTechniques.BubbleSort;

import java.util.Scanner;

/************ Sorting Algorithm : Bubble Sort **********************
 *
 * #GENERAL:
 * Bubble sort is a primitive sorting algorithm.
 * It is implemented by comparing two neighbours
 * and swapping if needed them pairwise on each pass.
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
 *******************************************************************/
class BubbleSort {

    static void runBubbleSort(int[] array) {
        int arrayLength = array.length;
        /* Outer Loop runs through the Entire List of Elements */
        for (int i = 0; i < arrayLength - 1; i++)
            /* Inner Loop runs through index 0 to (arrayLength-1) as Largest Number from the SubArray will be shifted to Last index of the SubArray each time Inner Loop Exits */
            for (int j = 0; j < arrayLength - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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

        runBubbleSort(array);
        System.out.println("Sorted array");
        printArray(array);
    }
}