/*
https://leetcode.com/problems/valid-parentheses/

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true

Example 2:

Input: "()[]{}"
Output: true

Example 3:

Input: "(]"
Output: false

Example 4:

Input: "([)]"
Output: false

Example 5:

Input: "{[]}"
Output: true


 */

class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length()%2 !=0) return false;
        if(s.isEmpty()) return true;

        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        map.put('<', '>');

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && map.containsKey(c) && stack.peek() == map.get(c)) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return stack.isEmpty();
    }
}