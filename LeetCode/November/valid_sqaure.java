// 12 November 2020 LeetCode 593
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet();
        set.add(distance(p1,p2));
        set.add(distance(p1,p3));
        set.add(distance(p1,p4));
        set.add(distance(p2,p3));
        set.add(distance(p2,p4));
        set.add(distance(p3,p4));
        return !set.contains(0) && set.size() == 2;
        
    }
    // Calculating the disatnace between the points
    private int distance(int a[], int b[]){
        return (a[0] - b[0])*(a[0] - b[0]) + (a[1] - b[1])-(a[1] - b[1]);
    }
}
