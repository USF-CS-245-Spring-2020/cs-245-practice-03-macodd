package Assigment2;

public class SelectionSort implements Practice03Sort {

    /*
    Sort method (Selection Sort):
    Rearranges passed array (a[]) by checking
    the current value against all the values
    before it in the array
     */

    // swaps two values with indexes i, j in array (arr[])
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // finds the lowest value index in the array (arr[])
    public int findMin(int[] arr, int start){
        for(int i = start + 1; i < arr.length; i++)
            if (arr[i] < arr[start])
                start = i;
        return start; // returns the index of the lowest value
    }

    // Sorts each element in the array (arr[])
    public void sort(int [] a){
        for (int i = 0; i < a.length - 1; i++)
            swap(a, i, findMin(a, i));
    }
}
