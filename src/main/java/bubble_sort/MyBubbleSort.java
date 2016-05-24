package bubble_sort;

import java.util.Arrays;

/**
 * Created on 13.5.16.
 *
 * simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
 * comparing each pair of adjacent items and swapping them if they are in the wrong order.
 *
 * Bubble sort has worst-case and average complexity both О(n2),
 * where n is the number of items being sorted.
 *
 */

public class MyBubbleSort {

    public static void main(String[] args) {

        int [] array = {7, 3, 9, -2, 5, 0, 23, -8};
        bubbleSort(array);
        print(array);

        // System.out.println(Arrays.toString(array));

    }

    /**
     * logic of sorting
     */

    public static void bubbleSort (int [] array){

        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]){
                    swap(array, j, j + 1);
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

    /**
     * printing method
     */

    public static void print(int [] array){

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1){
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]");
            }
        }
    }
}
