// package Assigment2;

public class LinearSearch implements Practice03Search {

    /*
    Search method (Linear):
    Checks from start to finish for a specific integer
    value (target) inside an integer array (arr[]).
    If found it returns the index of the value in the array
    else it returns -1.
     */
    public int search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){  // linear iteration of array
            if(arr[i] == target)
                return i;  // returns index of target if found
        }
        return -1;  // value to return if not found
    }
}
