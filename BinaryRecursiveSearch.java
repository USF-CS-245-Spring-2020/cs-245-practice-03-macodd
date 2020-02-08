// package Assigment2;

public class BinaryRecursiveSearch implements Practice03Search {

    /*
    Search method (Binary Recursive):
    Checks for a specific integer value (target) recursively
    inside an integer array (arr[]).
    If found it returns the index of the value in the array
    else it returns -1
     */
    public int search(int[] arr, int target){
        int min = 0;  // starting position for min
        int max = arr.length;  // max position based on array's size
        int mid = (arr.length)/2;  // index used for checking the array

        if (arr[mid] == target)
            return mid;  // index in array returned if found

        if (arr[mid] < target)
            return search(arr, target, mid + 1, max);  // calls its overloaded self with updated min and max
        else
            return search(arr, target, min, mid - 1);  // calls its overloaded self with updated min and max
    }

    public int search(int[] arr, int target, int min, int max){

        if (min >= max)
            return -1;  // // value to return if target not in array

        int mid = (min + max)/2;  // mid starts at the middle of array

        if (arr[mid] == target)
            return mid;  // index in array returned if found
        if (arr[mid] < target)
            return search(arr, target, mid + 1, max);  // update min value based on target
        else
            return search(arr, target, min, mid - 1);  // // update max value based on target
    }
}
