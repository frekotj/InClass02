/*
Software Engineering -- Spring 2020
In Class 02
Description: Quick Sort
Team: Larisa Fava
*/

class QuickSort implements SortMethods
{
    int partition(int qs_arr[], int low, int high)
    {
        int pivot = qs_arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (qs_arr[j] <= pivot)
            {
                i++;

                int temp = qs_arr[i];
                qs_arr[i] = qs_arr[j];
                qs_arr[j] = temp;
            }
        }

        int temp = qs_arr[i+1];
        qs_arr[i+1] = qs_arr[high];
        qs_arr[high] = temp;

        return i+1;
    }

    public void quick(int[] arr, int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);

            quick(arr, low, pi-1);
            quick(arr, pi+1, high);
        }
    }

    @Override
    public void radix(int[] arr, int high, int low) {

    }

    @Override
    public void bubble(int[] arr, int high, int low) {

    }
}