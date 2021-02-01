/*
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. */

public class Solution {
    public ArrayList<Integer> primesum(int A) {
         ArrayList<Integer> ans = new ArrayList<>();
          boolean prime[] = new boolean[A+1];
            Set<Integer> s = new HashSet<>();
        for(int i=0;i<=A;i++){
            prime[i] = true;
        }
        
        prime[0] = false;
        prime[1] = false;
        
        for(int i = 2;i*i<=A;i++){
            if(prime[i]){
                for(int j = 2*i;j<=A;j +=i){
                    prime[j] = false;
                }
            }
        }
       
        for(int i = 2;i<=A;i++){
            if(prime[i]){
                s.add(i);
            }
        }
        
         for (int i=2;i<=A;i++) {
            if(s.contains(i) && s.contains(A-i)){
                ans.add(i);
                ans.add(A-i);
                break;
            }
        }

        return ans;
        
    }
}
