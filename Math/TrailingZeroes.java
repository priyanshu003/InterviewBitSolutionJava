/*
https://www.interviewbit.com/problems/trailing-zeros-in-factorial/
Given an integer n, return the number of trailing zeroes in n!.
Note: Your solution should be in logarithmic time complexity.
Example :
n = 5
n! = 120 
Number of trailing zeros = 1
So, return 1
*/
//hint find number of 5 in N


public class Solution {
    public int trailingZeroes(int n) {
         // Initialize result 
        int count = 0; 
  
        // Keep dividing n by powers  
        // of 5 and update count 
        for (int i = 5; n / i >= 1; i *= 5) 
            count += n / i; 
  
        return count; 
    }
}
