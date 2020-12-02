// recursive approach
class Solution {
public:
    bool isMatch(string s, string p) {
        if(p.size() == 0 ){
            return s.size()==0;
        }
        if(p.size() > 1 && p[1] == '*'){
            if(isMatch(s, p.substr(2)))
                return true;
            if((s[0] == p[0] || p[0]=='.') && s.length() > 0){
                return isMatch(s.substr(1), p);
            }
            return false;
        }
        else{
            if((s[0] == p[0] || p[0] == '.') && s.size() > 0){
                return isMatch(s.substr(1), p.substr(1));
            }
            return false;
        }
        
    }
};
