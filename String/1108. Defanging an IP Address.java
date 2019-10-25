/**
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */

 //java inbuilt function 
class Solution {
    public String defangIPaddr(String address) {
        String string = address.replace(".", "[.]");
        return string; 
    }
}

//solution 2:
class Solution {
    public String defangIPaddr(String address) {
        int size = address.length();
        for(int i = 0; i < size; i++) {
            if(address.charAt(i) == '.') {
                address = address.substring(0,i) + "[.]" + address.substring(++i,size);
                size += 2;
            }
        }
        return address;
    }
}