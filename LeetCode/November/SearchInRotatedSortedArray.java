public class Solution {
    public boolean search(int[] A, int target) {
       
        return search(A, target, 0, A.length - 1);
    }
    
    public boolean search(int[] A, int target, int begin, int end){
        if(begin > end) return false;
        
        int midle = (begin + end) / 2;
        if(target == A[midle]) return true;
        
        if(A[midle] == A[begin] && A[midle] == A[end]){
            return search(A, target, midle + 1, end) ||
                search(A, target, begin, midle - 1);
        }
        
        if(A[midle] >= A[begin]){
            if(target < A[midle]){
                if(target >= A[begin])
                    return search(A, target, begin, midle - 1);
                else return search(A, target, midle + 1, end);
            }
            else return search(A, target, midle + 1, end);
        }
        else{
            if(target < A[midle])
                return search(A, target, begin, midle - 1);
            else{
                if(target >= A[begin])
                    return search(A, target, begin, midle - 1);
                else return search(A, target, midle + 1, end);
            }
        }
    }
}
