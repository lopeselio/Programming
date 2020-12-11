class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        while(i < arr.length && i + 1 < arr.length && arr[i] < arr[i+1]){
            i++;
        }
        if(i == 0 || i + 1 >= arr.length){
            return false;
        }
        while(i < arr.length && i+1 < arr.length){
            if(arr[i] <= arr[i++ + 1]){
                return false;
            }
        }
        return true;        
    }
}
