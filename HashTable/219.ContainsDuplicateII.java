import java.util.HashMap;

/**
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums[i].length; i++) {
            if (!hm.containsKey(nums[i])) { //if the HashMap hm doesn't contain the number(key)
                hm.put(nums[i], i);
            }
            else {
                if(Math.abs(hm.get(i)-i)<=k) {
                    return true;
                }
                else {
                    hm.remove(nums[i]);
                    hm.put(nums[i],i);
                }
            }
        }
        return false; 
    }
}