/*
https://www.interviewbit.com/problems/reverse-integer/
Reverse digits of an integer.
Example1:
x = 123,
return 321
Example2:
x = -123,
return -321
Return 0 if the result overflows and does not fit in a 32 bit signed integer
*/
 public class Solution {
public int reverse(int A) {
if(A==0 || A>Integer.MAX_VALUE || A<Integer.MIN_VALUE){
return 0;
}
boolean var;
if(A<0){
var=true;
}else{
var=false;
}
int num=Math.abs(A);
long rev=0;
while(num>0){
int d=num%10;
rev=rev*10+d;
if(rev>Integer.MAX_VALUE){
return 0;
}
num=num/10;
}
if(rev>Integer.MAX_VALUE){
return 0;
}
if(var){
return (int)-rev;
}else{
return (int)rev;
}
}
}
