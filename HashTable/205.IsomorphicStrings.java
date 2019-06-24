/**
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */
//Solution 1: using HashMap and HashSet
//We can also simply check if a value is mapped twice by checking the number of unique elements.
//e.g. 'ab' & 'aa'
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (hm.containsKey(c1)) {
                if (c2 != hm.get(c1)) {
                    return false;
                }
            }
            else {
                hm.put(c1, c2); 
            }
        }
        HashSet<Character> hs = new HashSet<Character>(hm.values());
        if (hs.size() != hm.values().size()) {
            return false;
        }
        return true; 
     }
}

//Solution 2: using two HashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hm1 = new HashMap<Character, Character>();
        HashMap<Character, Character> hm2 = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (hm1.containsKey(c1)) {
                if (c2 != hm1.get(c1)) {
                    return false; 
                }
            }
            else {
                if (hm2.containsKey(c2)) {
                    if(c1 !=hm2.get(c2)) {
                        return false; 
                    }
                }
            }
            hm1.put(c1, c2);
            hm2.put(c2, c1);
        }
        return true; 
    }
}