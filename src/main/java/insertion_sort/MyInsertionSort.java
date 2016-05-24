package insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 13.5.16.
 *
 * It builds the final sorted array one item at a time.
 * It is much less efficient on large lists than other sort algorithms
 * Insertion sort iterates through the list by consuming one input element at each repetition,
 * and growing a sorted output list.
 *
 */

public class MyInsertionSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");

        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("Unsorted array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(100 * Math.random());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
         //   System.out.print(" ");
        }

        System.out.println();
        System.out.println("Sorted array: ");

        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }

    /**
     * logic of sorting
     */

    public static void insertionSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]){

                    swap(array, j, j - 1);

                }
            }
        }
    }

        /**
         * swapping method
         */

        public static void swap(int [] array, int a, int b){

            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }

