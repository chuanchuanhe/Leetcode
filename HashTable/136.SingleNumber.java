/**
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
//A solution using hashset
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>(); 
        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else {
                hs.remove(nums[i]);
            }
        }
        Iterator it = hs.iterator();
        return (Integer) it.next(); //casting regarding Object 
        //or return hs.iterator().next();
    }
}