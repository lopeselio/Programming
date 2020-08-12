//Smallest N digit number whose sum of square of digits is a Perfect Square
//Last Updated: 30-07-2020
//Given an integer N, find the smallest N digit number such that the sum of the square of digits (in decimal representation) of the number is also a perfect square. If no such number exists, print -1.
//Examples:
// 
//
//Input : N = 2 
//Output : 34 
//Explanation: 
//The smallest possible 2 digit number whose sum of square of digits is a perfect square is 34 because 32 + 42 = 52.
//Input : N = 1 
//Output : 1 
//Explanation: 
//The smallest possible 1 digit number is 1 itself. 

Backtracking : 

// Java implementation to find Smallest N 
// digit number whose sum of square 
// of digits is a Perfect Square 
class GFG{ 
      
// function to check if 
// number is a perfect square 
static int isSquare(int n) 
{ 
    int k = (int)Math.sqrt(n); 
    return k * k == n ? 1 : 0; 
} 
  
// Function to calculate the 
// smallest N digit number 
static int calculate(int pos, int prev, 
                     int sum, int[] v) 
{ 
    if (pos == v.length) 
        return isSquare(sum); 
  
    // Place digits greater than equal to prev 
    for(int i = prev; i <= 9; i++)  
    { 
        v[pos] = i; 
        sum += i * i; 
  
        // Check if palcing this digit leads 
        // to a solution then return it 
        if (calculate(pos + 1, i, sum, v) != 0) 
            return 1; 
  
        // Else backtrack 
        sum -= i * i; 
    } 
    return 0; 
} 
  
static String minValue(int n) 
{ 
    int[] v = new int[n]; 
    if (calculate(0, 1, 0, v) != 0) 
    { 
          
        // Create a string representing 
        // the N digit number 
        String answer = ""; 
          
        for(int i = 0; i < v.length; i++) 
            answer += (char)(v[i] + '0'); 
  
        return answer; 
    } 
    else
        return "-1"; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    // Initialise N 
    int N = 2; 
  
    System.out.println(minValue(N)); 
} 
} 
