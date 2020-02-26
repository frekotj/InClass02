/*
Software Engineering -- Spring 2020
In Class 02
Description: Sort Random Arrays of Numbers
Team: Larisa Fava, Jarod Frekot, Valeria Aguilar
*/

import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Sorter qs = new Sorter();
        Sorter bs = new Sorter();
        Sorter rs = new Sorter();
        Random rnd = new Random();

        int[] arr = new  int[10];
        int[] qs_arr = new int[10];
        int[] rs_arr = new int[10];
        int[] bs_arr = new int[10];
        int n = arr.length;

        for (int i = 0; i < arr.length; i++)
        {
            qs_arr[i] = rnd.nextInt(100);
            rs_arr[i] = rnd.nextInt(100);
            bs_arr[i] = rnd.nextInt(100);

        }

        System.out.println("Unsorted Array: " + Arrays.toString(qs_arr));
        qs.sort(qs_arr, 0, n-1); //sort the array
        System.out.println("Quick Sort: \t" + Arrays.toString(qs_arr));
        System.out.println();

        System.out.println("Unsorted Array: " + Arrays.toString(rs_arr));
        rs.sort(rs_arr, 0, n-1);
        System.out.println("Radix Sort: \t" + Arrays.toString(rs_arr));
        System.out.println();

        System.out.println("Unsorted Array: " + Arrays.toString(bs_arr));
        bs.sort(bs_arr, 0, n-1);
        System.out.println("Bubble Sort: \t" + Arrays.toString(bs_arr));
        System.out.println();
    }

}
