/*Problem Description

Given a number A in a form of string.

You have to find the smallest number that has same set of digits as A and is greater than A.

If A is the greatest possible number with its set of digits, then return -1.



Problem Constraints
1 <= A <= 10100000

A doesn't contain leading zeroes.



Input Format
First and only argument is an numeric string denoting the number A.



Output Format
Return a string denoting the smallest number greater than A with same set of digits , if A is the largest possible then return -1.



Example Input
Input 1:

 A = "218765"
Input 2:

 A = "4321"


Example Output
Output 1:

 "251678"
Output 2:

 "-1"


Example Explanation
Explanation 1:

 The smallest number greater then 218765 with same set of digits is 251678.
Explanation 2:*/

// The given number is the largest possible number with given set of digits so we will retu
public class Solution {
    public String solve(String A) {
        char[] a = A.toCharArray();
        int i=a.length-2;
        while(i>=0 && a[i]>=a[i+1]) i--;
        if(i==-1) return "-1";
        int j=a.length-1;
        while(j>=0 && a[j]<=a[i]) j--;
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        int start = i+1;
        int end = a.length-1;
        while(start<end){
            temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
        return new String(a);
    }
}
