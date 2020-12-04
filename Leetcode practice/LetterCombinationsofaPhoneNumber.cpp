//LeetCode 17: Letter Combinations of a Phone Number

//Add to List


//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

//Example 1:
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

//Example 2:
//Input: digits = ""
//Output: []

//Example 3:
//Input: digits = "2"
//Output: ["a","b","c"]

//Constraints:

//0 <= digits.length <= 4
//digits[i] is a digit in the range ['2', '9'].

class Solution {
    
public:
    void LetterComb(string digits, vector<string> &res, string nums[], int i, string s){
        if(i == digits.length()){
            res.push_back(s);
            return;
        }
        string val = nums[digits[i]-'0'];
        for(int j=0; j < val.length();j++){
            LetterComb(digits, res, nums, i+1, s+val[j]);
        }
    }
    vector<string> letterCombinations(string digits) {
        vector<string> res;
        if(digits.length() == 0){
            return res;
        }
        string nums[10] = {"","","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LetterComb(digits, res, nums, 0,"");
        return res;
        
    }
};

