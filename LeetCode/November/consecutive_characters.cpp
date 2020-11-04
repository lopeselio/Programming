class Solution {
public:
    int maxPower(string s) {
        int maxi = 1;
        int cStreak = 0;
        int j = 0;
        for(int i =0; i<s.size(); i++){
            if(s[i] == s[j])
                cStreak++;
            else{
                maxi=max(maxi, cStreak);
                j=i;
                cStreak=1;
            }
        }
        maxi = max(maxi,cStreak);
        return maxi;
        
    }
};