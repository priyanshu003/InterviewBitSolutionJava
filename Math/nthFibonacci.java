/*Problem Description

Given an integer A you need to find the Ath fibonacci number modulo 109 + 7.

The first fibonacci number F1 = 1

The first fibonacci number F2 = 1

The nth fibonacci number Fn = Fn-1 + Fn-2 (n > 2)



Problem Constraints
1 <= A <= 109.



Input Format
First argument is an integer A.



Output Format
Return a single integer denoting Ath fibonacci number modulo 109 + 7.



Example Input
Input 1:

 A = 4
Input 2:

 A = 3


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 F3 = F2 + F1 = 1 + 1 = 2
 F4 = F3 + F2 = 2 + 1 = 3
Explanation 2:

 F3 = F2 + F1 = 1 + 1 = 2 */

public class Solution {
    
    static final long MOD = 1000000007L;
    
    public int solve(int A) {
        // long prev = 0;
        // long cur = 1;
        // long nxt = 1;
        // if(A == 0) return 0;
        // if(A == 1) return 1;
        // for(int i = 0; i < A - 1; i++) {
        //     nxt = (cur + prev) % 1000000007;
        //     prev = cur;
        //     cur = nxt;
        // }
        
        // return (int)nxt;
        // Above approach will give TLE. Using solution from Hint 1
        
        if(A<=2) return 1;
        long[][] m = {{1L, 1L}, {1L, 0L}};
        long[][] resultM = matPow(m, A-1);
        long res = resultM[0][0] % MOD;
        return (int)res;
    }
    
    long[][] matMul(long[][] m1, long[][] m2){
        // Matrix multiplication
        long[][] ans = new long[2][2];
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                long sum = 0;
                for(int k = 0; k < 2; k++) {
                    long prod = (m1[i][k] * m2[k][j]) % MOD;
                    sum = (sum + prod)% MOD;
                }
                
                ans[i][j] = sum;
            }
        }

        return ans;
    }
    
    long[][] matPow(long[][] m, int n){
        if(n==0) return new long[][]{{1L, 0L}, {0L, 1L}}; // Identity matrix. A ^ 0 = I
        long[][] halfPow  = matPow(m, n/2);
        long[][] tmp = matMul(halfPow, halfPow);

        if(n%2 == 0)  
            return tmp;
        return matMul(tmp , m);
    }
}
