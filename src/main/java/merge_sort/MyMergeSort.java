package merge_sort;

import java.util.Arrays;

/**
 * Created on 13.5.16.
 */
public class MyMergeSort{

    public static void main(String[] args){

        Integer [] array = {12, -16, 333, -50, 1000, 5, 897, 1, 3, 66, -13};

        mergeSort(array);

        System.out.println(Arrays.toString(array));

    }

    /**
     * logic of sorting
     */

    public static Comparable[] mergeSort(Comparable[] list){

        if (list.length <= 1) {
            return list;
        }

        Comparable[] firstHalf = new Comparable[list.length / 2];
        Comparable[] secondHalf = new Comparable[list.length - firstHalf.length];

        System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
        System.arraycopy(list, firstHalf.length, secondHalf, 0, secondHalf.length);

        mergeSort(firstHalf);
        mergeSort(secondHalf);


        merge(firstHalf, secondHalf, list);
        return list;
    }

    public static void merge(Comparable[] first, Comparable[] second, Comparable[] result){

        //Index Position in first array - starting with first element
        int indexFirstHalf = 0;

        //Index Position in second array - starting with first element
        int indexSecondHalf = 0;

        //Index Position in merged array - starting with first position
        int indexMerged = 0;


        while (indexFirstHalf < first.length && indexSecondHalf < second.length){

            if (first[indexFirstHalf].compareTo(second[indexSecondHalf]) < 0){

                result[indexMerged] = first[indexFirstHalf];
                indexFirstHalf++;

            } else {

                result[indexMerged] = second[indexSecondHalf];
                indexSecondHalf++;
            }

            indexMerged++;
        }

        System.arraycopy(first, indexFirstHalf, result, indexMerged, first.length - indexFirstHalf);
        System.arraycopy(second, indexSecondHalf, result, indexMerged, second.length - indexSecondHalf);

    }
}