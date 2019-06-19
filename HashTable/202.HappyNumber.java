/**
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */
//A solution using HashSet 
//calculate the sum, then 
//if the number doesn't exist in the hashset,then add it to the hashset
//if exists, check if it equals to 1,if yes return true else return false 
class Solution {
    public int calcSum(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        int num = 0; 
        while (n > 0) {
            stack.push(n%10);
            n = n/10;
        }
        while (!stack.isEmpty()) {
            num = stack.pop();
            sum = sum + num*num; 
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int sum = calcSum(n); 
        while (!hs.contains(sum)) {
            hs.add(sum);
            sum = calcSum(sum); 
        }
        if (sum == 1) {
            return true;
        }
        else {
            return false; 
        }
    }
}