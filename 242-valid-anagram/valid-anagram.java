class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s","").toLowerCase();
        t = t.replaceAll("\\s","").toLowerCase();
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
        {
            return true;
        }
        return false;
    }
}