package Assigment2;

public class BubbleSort implements Practice03Sort {

    /*
    Sort method (Bubble Sort):
    Rearranges passed array (a[]) by checking
    the current value against the next
     */
    public void sort(int[] a){
        int n = a.length;  // length of array
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

