/**
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hs1 =new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (!hs1.containsKey(nums1[i])) {
                hs1.put(nums1[i], 1);
            }
            else {
                hs1.put(nums1[i], hs1.get(nums1[i])+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int j = 0; j < nums2.length; j++) {
            if (hs1.containsKey(nums2[j]) && hs1.get(nums2[j])>0) {
                list.add(nums2[j]);
                hs1.put(nums2[j], hs1.get(nums2[j])-1); 
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i); 
        }
        return answer; 
    }
}