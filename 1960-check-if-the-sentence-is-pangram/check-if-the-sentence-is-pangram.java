class Solution {
    public boolean checkIfPangram(String sentence) {
        Set <Character> s = new HashSet<>();
       sentence = sentence.replaceAll("\\s","").toLowerCase();
       for(char ch = 'a';ch<='z';ch++)
       {
        s.add(ch);
       }
       for(int i = 0;i<sentence.length();i++)
       {
        char ch = sentence.charAt(i);
        s.remove(ch);
       } 
        return s.isEmpty();
    }
}