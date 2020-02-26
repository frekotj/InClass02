/*
Software Engineering -- Spring 2020
In Class 02
Description: Sorter Class
Team: Larisa Fava
*/

public class Sorter {
    QuickSort quick = new QuickSort();
    BubbleSort bubble = new BubbleSort();
    RadixSort radix = new RadixSort();

    public int[] sort(int[] arr, int high, int low) {
        quick.quick(arr, high, low);
        bubble.bubbleSort(arr);
        radix.RadixSort(arr);
        return arr;
    }

}
