// Nov 11 2020 LeetCode 832 Flipping an Image
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] row : A){
            int l = 0;
            int r = row.length - 1;
            while(l <= r){
                int temp = row[l];
                row[l++] = row[r]^1;
                row[r--] = temp^1;
            }
        }
        return A;
        
    }
}
