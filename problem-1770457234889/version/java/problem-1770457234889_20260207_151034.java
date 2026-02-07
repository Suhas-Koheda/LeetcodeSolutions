// Last updated: 07/02/2026, 15:10:34
1class Solution {
2    public String reverseByType(String s) {
3        Stack<Character> lower=new Stack<>();
4        Stack<Character> special=new Stack<>();
5        for(char i:s.toCharArray()){
6            if(Character.isLowerCase(i)) lower.push(i);
7            if(!Character.isAlphabetic(i)) special.push(i);
8        }
9        StringBuffer s1=new StringBuffer();
10        for(char i:s.toCharArray()){
11            if(Character.isLowerCase(i)) s1.append(lower.pop());
12            if(!Character.isAlphabetic(i)) s1.append(special.pop());      
13        }
14        return s1.toString();
15    }
16}