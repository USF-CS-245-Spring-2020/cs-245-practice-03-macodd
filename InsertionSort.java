package Assigment2;

public class InsertionSort implements Practice03Sort {

    /*
    Sort method (Insertion Sort):
    Rearranges passed array (a[]) by checking
    the current value against all the values
    before it in the array
     */
    public void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int current = a[i];  // current value
            int prev = i - 1;  // value stored on the previous index

            /* Move elements of arr[0..i-1], that are
               greater than current, to one position ahead
               of their current position */
            while (prev >= 0 && a[prev] > current) {
                a[prev + 1] = a[prev];
                prev -= 1;
            }
            a[prev + 1] = current;
        }
    }
}
