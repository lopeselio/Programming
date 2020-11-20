// Decode string LeetCode 394 Java using Stack | 20th November 2020

// Example 1:
// Input: s = "3[a]2[bc]"
// Output: "aaabcbc"

// Example 2:
// Input: s = "3[a2[c]]"
// Output: "accaccacc"


class Solution {
    public String decodeString(String s) {
        Stack<Integer> is = new Stack<>();
        Stack<String> ss = new Stack<>();
        int ptr = 0;
        String res = "";
        while(ptr < s.length()){
            char curr = s.charAt(ptr);
            if(Character.isDigit(curr)){
                int num = 0;
                while(Character.isDigit(s.charAt(ptr))){
                    num = num*10 + s.charAt(ptr) - '0';
                    ptr++;
                }
                is.push(num);
            }
            else if(curr == '['){
                ss.push(res);
                res = "";
                ptr++;
            }
            else if(curr == ']'){
                StringBuilder sb = new StringBuilder(ss.pop());
                int count = is.pop();
                for(int i = 1; i <= count; i++){
                    sb.append(res);
                }
                res = sb.toString();
                ptr++;
            }
            else{  // absence of square brackets, build alphateic string and update the pointer
                res += curr;
                ptr++;
            }
        }
        return res;        
    }
}
