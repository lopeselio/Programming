class Solution {
public:
    int lengthOfLastWord(string s) {
        /*
        stringstream ss(s);
        string word;
        while(ss >> word){}
        return word.length();
        */
        int n = s.length(), result = 0;
        while(n > 0){
            if(s[--n] != ' ') result++;
            else if(result > 0) return result;
        }
        return result;
    }
};
