/*
https://www.interviewbit.com/problems/palindrome-integer/
Determine whether an integer is a palindrome. Do this without extra space.
A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.
Example :
Input : 12121
Output : True
Input : 123
Output : False
*/
public class Solution {
    public int isPalindrome(int A)
    {
          int x=0;
    int B=A;
    while(A>0){
    x=x*10+(A%10);
    A=A/10;
    }
    if(x==B){
    return 1;
    }
    else{
    return 0;
    }

       
    }
}
