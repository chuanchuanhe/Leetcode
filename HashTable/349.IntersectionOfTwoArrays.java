/**
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> answer = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (hs1.contains(nums2[j])) {
                answer.add(nums2[j]); 
            }
        }
        int[] arr = new int[answer.size()];
        Iterator<Integer> value = answer.iterator(); 
        for (int i = 0; i < answer.size(); i++){
            arr[i] = value.next();
        }
        return arr; 
    }
}

/**
key notes: how to convert HashSet to Array 
 */