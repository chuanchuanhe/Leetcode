/**
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
//Solution 1 using HashTable:
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }
        int[] counter = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt[i]-'a'] = counter[s.charAt[i]-'a'] + 1;
            counter[t.charAt[i]-'a'] = counter[t.charAt[i]-'a'] - 1;
        }
        for (int j = 0; j < counter.length; j++) {
            if (counter[j] != 0) {
                return false;
            }
        }
        return true; 
    }
}

/**
character minus character:
'a'-'a'=0
'b'-'a'=1
'c'-'a'=2
'd'-'a'=3
......
 */

//defaut value of 0 for arrays of integral types

//Solution 2: using Sorting 

class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()) {
             return false;
         }
         char[] str1 = s.toCharArray();
         char[] str2 = t.toCharArray();
         Arrays.sort(str1);
         Arrays.sort(str2);
         return Arrays.equals(str1, str2);
    }
}