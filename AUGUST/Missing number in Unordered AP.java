//Find the missing number in unordered Arithmetic Progression
//
//Given an unsorted array arr[] of N integers that are in Arithmetic Progression, the task is to print the missing element from the given series.
//Examples: 
// 
//
//Input: arr[] = {12, 3, 6, 15, 18} 
//Output: 9 
//Explanation: 
//The elements given in order are: 3, 6, 12, 15, 18. 
//Hence missing element is 9.
//Input: arr[] = {2, 8, 6, 10} 
//Output: 4 
//Explanation: 
//The elements given in order are: 2, 6, 8, 10. 
//Hence missing element is 4. 

import java.util.Arrays; 
class GFG{
     
// Function to find the missing element
static int findMissing(int arr[], int left,
                       int right, int diff)
{
 
    // Fix left and right boundary
    // for binary search
    if (right <= left)
        return 0;
 
    // Find index of middle element
    int mid = left + (right - left) / 2;
 
    // Check if the element just after
    // the middle element is missing
    if (arr[mid + 1] - arr[mid] != diff)
        return (arr[mid] + diff);
 
    // Check if the element just
    // before mid is missing
    if (mid > 0 &&
        arr[mid] - arr[mid - 1] != diff)
        return (arr[mid - 1] + diff);
 
    // Check if the elements till mid
    // follow the AP, then recur
    // for right half
    if (arr[mid] == arr[0] + mid * diff)
        return findMissing(arr, mid + 1,
                           right, diff);
 
    // Else recur for left half
    return findMissing(arr, left,
                       mid - 1, diff);
}
 
// Function to find the missing
// element in AP series
static int missingElement(int arr[], int n)
{
 
    // Sort the array arr[]
    Arrays.sort(arr); 
 
    // Calculate Common Difference
    int diff = (arr[n - 1] - arr[0]) / n;
 
    // Binary search for the missing
    return findMissing(arr, 0, n - 1, diff);
}
 
// Driver Code
public static void main(String[] args)
{
    // Given array arr[]
    int arr[] = new int[]{ 2, 8, 6, 10 };
    int n = arr.length;
 
    // Function Call
    System.out.println(missingElement(arr, n));
}
}
 
// This code is contributed by rock_cool

 
