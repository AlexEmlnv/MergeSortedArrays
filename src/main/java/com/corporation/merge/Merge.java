package com.corporation.merge;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {

            if (left[leftIndex] < right[rightIndex]) {
                rsl[resultIndex] = left[leftIndex];
                leftIndex++;
                resultIndex++;

            } else if (right[rightIndex] < left[leftIndex]) {
                rsl[resultIndex] = right[rightIndex];
                rightIndex++;
                resultIndex++;

            } else {
                rsl[resultIndex] = left[leftIndex];
                leftIndex++;
                resultIndex++;

                rsl[resultIndex] = right[rightIndex];
                rightIndex++;
                resultIndex++;
            }

        }

        if (leftIndex < left.length ) {
            System.arraycopy(left, leftIndex, rsl, resultIndex, left.length - leftIndex );
        }

        if (rightIndex < right.length ) {
            System.arraycopy(right, rightIndex, rsl, resultIndex, right.length - rightIndex );
        }

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 4, 5, 101},
                new int[] {2, 4, 4, 4, 8, 9, 12, 99}
        );
        System.out.println(Arrays.toString(rsl));
    }
}