class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if(pattern.length() != words.length)
        {
            return false;
        }
        HashMap<Character, String> hh = new HashMap<Character, String>();
        for(int i = 0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            boolean containsKey = hh.containsKey(ch);
            if(hh.containsValue(words[i]) && !containsKey)
            {
                return false;
            }
             if(containsKey && !hh.get(ch).equals(words[i]))
            {
                return false;
            }
            else 
            {
                hh.put(ch,words[i]);
            }
        }
        return true;
    }
}