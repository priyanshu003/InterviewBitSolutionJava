/*Problem Description

Given a positive integer A, return its corresponding column title as appear in an Excel sheet.



Problem Constraints
1 <= A <= 1000000000



Input Format
First and only argument is integer A.



Output Format
Return a string, the answer to the problem.



Example Input
Input 1:

 A = 1
Input 2:

 A = 28


Example Output
Output 1:

 "A"
Output 2:

 "AB"


Example Explanation
Explanation 1:

 1 -> A
Explanation 2:

1 -> A
2 -> B
3 -> C
...
26 -> Z
27 -> AA
28 -> AB */



public class Solution {
    public String convertToTitle(int n) {
        StringBuilder ct = new StringBuilder();
        while(n>0){
            int  rem = n%26;
            
            if(n%26 == 0){
                
                ct.append('Z');
                n = n/26 - 1;
            }else{
                ct.append((char)(rem - 1 + 'A'));
                n = n/26 ;
            }
            
            
        }
        
        ct = ct.reverse();
        String c = ct.toString();
        return c ;
    }
}
