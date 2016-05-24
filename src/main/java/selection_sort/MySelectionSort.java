package selection_sort;

import java.util.Arrays;

/**
 * Created on 13.5.16.
 *
 * The selection sort is a combination of searching and sorting.
 * During each pass, the unsorted element with the smallest (or largest) value
 * is moved to its proper position in the array.
 *
 */

public class MySelectionSort {

    public static void main(String[] args) {

        int [] array = {10, 34, 2, 56, -6, 0, 13};
        selectionSort(array);
        //print(array);
        System.out.println(Arrays.toString(array));

    }

    /**
     * logic of sorting
     */

    public static void selectionSort(int [] array){

        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]){
                    minIdx = j;
                }
            }

            swap(array, i, minIdx);

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
