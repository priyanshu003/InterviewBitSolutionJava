/*
Problem Description

Given the position of a Bishop (A, B) on an 8 * 8 chessboard.

Your task is to count the total number of squares that can be visited by the Bishop in one move.

The position of the Bishop is denoted using row and column number of the chessboard.



Problem Constraints
1 <= A, B <= 8



Input Format
First argument is an integer A denoting the row number of the bishop.

Second argument is an integer B denoting the column number of the bishop.



Output Format
Return an integer denoting the total number of squares that can be visited by the Bishop in one move.



Example Input
Input 1:

 A = 4
 B = 4


Example Output
Output 1:

 13 */
 
 public class Solution {
    public int solve(int A, int B) {
        int i  = 0, j = 0 , ans = 0;
        
        i = A+1;
        j = B-1;
        while(i<=8 && j>=1){
            i++;
            j--;
            ans++;
            
        }
        
        i = A+1;
        j = B+1;
        while(i<=8 && j<=8){
            i++;
            j++;
            ans++;
            
        }
          i = A-1;
        j = B+1;
        while(i>=1 && j<=8){
            i--;
            j++;
            ans++;
            
        }
          i = A-1;
        j = B-1;
        while(i>=1 && j>=1){
            i--;
            j--;
            ans++;
            
        }
        return ans;
    }
}
