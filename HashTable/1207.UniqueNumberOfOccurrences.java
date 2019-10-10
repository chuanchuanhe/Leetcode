/**
Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //Find the number of occurrences of each element in the array using a hash map.
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            }
            else {
                hm.put(arr[i],hm.get(arr[i])+1); 
            }
        }
        //Iterate through the hash map and check if there is a repeated value.
        HashSet<Integer> hs = new HashSet<Integer>();
        for (Integer key : hm.keySet()) {
            Integer value = hm.get(key); 
            if (!hs.contains(value)) {
                hs.add(value); 
            }
            else {
                return false;
            }
        }
        return true; 
    }
}