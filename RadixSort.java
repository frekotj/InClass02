/*
Software Engineering -- Spring 2020
In Class 02
Description: Radix Sort
Team: Valeria Aguilar
*/

import java.util.ArrayList;
import java.util.List;

class RadixSort implements SortMethods {

    public void RadixSort(int[] input){
        final int RADIX = 10;

        List<Integer>[] bucket = new ArrayList[RADIX];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        boolean maxLength = false;
        int tmp;
        int placement = 1;

        while (!maxLength) {
            maxLength = true;

            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);

                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            int a = 0;
            for (int b = 0; b < RADIX; b++) {

                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            placement *= RADIX;
        }
    }

    @Override
    public void quick(int[] arr, int high, int low) {

    }

    @Override
    public void radix(int[] arr, int high, int low) {

    }

    @Override
    public void bubble(int[] arr, int high, int low) {

    }
}

