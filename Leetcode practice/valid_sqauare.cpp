// LeetCode 593 Valid Square 
class Solution {
    int distance(vector<int>& a, vector<int>& b){
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
public:
    bool validSquare(vector<int>& p1, vector<int>& p2, vector<int>& p3, vector<int>& p4) {
        vector<int> sides = {
            distance(p1, p2),
            distance(p1, p3),
            distance(p1, p4),
            distance(p2, p3),
            distance(p2, p4),
            distance(p3, p4),
        };
        
        unordered_map<int, int> m;
        for(auto& s: sides){
            if(!m.count(s)) m.insert({s, 1});
            else m[s]++;
        }
        
        if(m.size() != 2) return false;
        for(auto& p: m) return (p.second == 4) || (p.second == 2);
        return false;
    }
};
