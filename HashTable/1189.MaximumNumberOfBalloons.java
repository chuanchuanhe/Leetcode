/**
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.


Example 1:

Input: text = "nlaebolko"
Output: 1
Example 2:

Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0
 */


class Solution {
    public int maxNumberOfBalloons(String text) {
       //count the frequency of letters in the given string 
      //find the letter that can make the minimum number of instances of word 'balloon'
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                if (!hm.containsKey(c)) {
                    hm.put(c, 1);
                }
                else {
                    hm.put(c, hm.get(c)+1); 
                }
            }
            else {
                //do nothing 
            }
        }
        if (hm.size() == 5) {
            Integer minNumber = Stream.of(hm.get('b'), hm.get('a'), hm.get('l')/2, hm.get('o')/2, hm.get('n')).min(Comparator.comparing(Integer::valueOf)).get();
        return minNumber; 
        }
       else {
           return 0; 
       }
    }
}

