class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        // dfs approach
        dfs(s, 0, new ArrayList<>());
        return result;  
    }
    void dfs(String s, int start, List<String> list){
        if(s.length() == start){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i< s.length(); i++){
            if(isPalindrome(s, start, i)){
                list.add(s.substring(start, i+1));
                dfs(s, i+1, list);
                list.remove(list.size()-1);
            }
        }
    }
    
    boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
