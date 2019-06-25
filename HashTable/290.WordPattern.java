/**
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
 */

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" "); 
        if (pattern.length() != words.length) {
            return false; 
        }
        HashMap<Character, String> hm = new HashMap<Character, String>();
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(pattern.charAt(i))) {
                if (!hm.get(pattern.charAt(i)).equals(words[i])) {
                    return false; 
                }
            }
            else { // when the HashMap doesn't have the key but cotain the value -> not one-one- mapping 
                if (hm.containsValue(words[i])){
                    return false;
                }
            }
            hm.put(pattern.charAt(i), words[i]);
        }
        return true; 
    }
}


//to split a string between space, use str.split(" ") method 
/**
In java when comparing strings, use .equals() method -> comparing whether the content is the same
*** Don't use == (double equal), which compares the address of the two strings 
 */