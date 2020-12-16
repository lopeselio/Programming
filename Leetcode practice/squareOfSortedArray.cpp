// two pointer appraoch
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int start=0; int end = nums.size()-1;
        vector<int> arr(nums.begin(), nums.end());
        int index = nums.size()-1;
        while(index >= 0){
            if(nums[start]*nums[start] > nums[end]*nums[end]){
                arr[index--] = nums[start]*nums[start];
                start++;
            }else{
                arr[index--] = nums[end]*nums[end];
                end--;
            }
        }
        return arr;
    }
};
