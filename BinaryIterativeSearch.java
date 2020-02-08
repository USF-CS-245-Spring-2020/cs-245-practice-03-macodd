// package Assigment2;

public class BinaryIterativeSearch implements Practice03Search {

    /*
    Search method (Binary Iterative):
    Checks for a specific integer value (target) using a while loop
    inside an integer array (arr[]).
    If found it returns the index of the value in the array
    else it returns -1
     */
    public int search(int[] arr, int target){
        int min = 0;  // starting position for min
        int max = arr.length;  // max position based on array's size
        int mid;  // index used for checking the array

        while( min < max ){

            mid = (min + max)/2;  // mid starts at the middle of array

            if(arr[mid] == target)
                return mid;  // index in array returned if found
            if(arr[mid] < target)
                min = mid + 1;  // update min value based on target
            else
                max = mid - 1;  // update max value based on target
        }
        return -1;  // value to return if target not in array
    }
}
