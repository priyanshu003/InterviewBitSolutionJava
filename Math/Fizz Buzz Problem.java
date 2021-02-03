  
/* Fizzbuzz is one of the most basic problems in the coding interview world. Try to write a small and elegant code for this problem. 
Given a positive integer A, return an array of strings with all the integers from 1 to N.
But for multiples of 3 the array should have “Fizz” instead of the number.
For the multiples of 5, the array should have “Buzz” instead of the number.
For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.

Look at the example for more details.

Example

A = 5
Return: [1 2 Fizz 4 Buzz] */
//code

public class Solution {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> s = new ArrayList<>();
        
        int c3 = 0;
        int c5 = 0;
        for(int i = 1;i<=n;i++){
           c3++;
           c5++;
             String d = "";
           if(c3 == 3){
               d += "Fizz";
               //s.add(d);
               c3 = 0;
           }if(c5 == 5){
               d += "Buzz";
               //s.add(d);
               c5 = 0;
               
           }if(d == ""){
            
               s.add(Integer.toString(i));
           }else{
               s.add(d);
           }
        }
        return s;
    }
}
