/*
Sorted Permutation Rank
Given a string, find the rank of the string amongst its permutations sorted lexicographically. 
Assume that no characters are repeated.
Example :
Input : 'acb'
Output : 2
The order permutations with letters 'a', 'c', and 'b' : 
abc
acb
bac
bca
cab
cba
The answer might not fit in an integer, so return your answer % 1000003
*/


public class Solution {
    static int mod = 1000003;
  public static int fact(int n)
{
        if(n==0) return 1 ; 
        else return (n*fact(n-1)) %mod;
}
    public static int findRank(String a) {
        
        char s[] = a.toCharArray();
        int n = a.length();
        
        int ans = 0;
        
        for(int i=0;i<a.length()-1;i++){
            int c = 0;
            for(int j =i+1;j<a.length();j++){
                 if(s[j]<s[i])
                    c++;
            }
             ans+=( (c*fact(n-i-1)) )%mod;
        }
        return (ans+1)%mod;
        
    }
}
