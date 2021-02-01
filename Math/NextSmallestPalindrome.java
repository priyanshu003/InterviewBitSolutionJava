  
/*
Problem Description

Given a numeric string A representing a large number you need to find the next smallest palindrome greater than this number.



Problem Constraints
1 <= |A| <= 100

A doesn't start with zeroes and always contain digits from 0-9.



Input Format
First and only argument is an string A.



Output Format
Return a numeric string denoting the next smallest palindrome greater than A.



Example Input
Input 1:

 A = "23545"
Input 2:

 A = "999"


Example Output
Output 1:

 "23632"
Output 2:

 "1001"
*/

public class Solution {
    public String solve(String num) {
        int len = num.length();
        String left = num.substring(0, len / 2);
        String middle = num.substring(len / 2, len - len / 2);
        String right = num.substring(len - len / 2);

        if (right.compareTo(reverse(left)) < 0)
            return left + middle + reverse(left);

        String next = new BigInteger(left + middle).add(BigInteger.ONE).toString();
        return next.substring(0, left.length() + middle.length())
             + reverse(next).substring(middle.length());
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
}
