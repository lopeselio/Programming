class Solution {
public:
    string largestTimeFromDigits(vector<int>& A) {
        string result;
        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 4; ++j){
                for(int k = 0; k < 4; ++k){
                    if(i == j || j == k || k == i) continue;
                    string hh = to_string(A[i]) + to_string(A[j]);
                    string mm = to_string(A[k]) + to_string(A[6-i-j-k]);
                    string _time = hh + ":" + mm;
                    if(hh < "24" && mm < "60" && _time > result) result = _time;
                }
            }
        }
        return result;
    }
};
