class Solution {
    public String compressedString(String word) {
        int count = 1;
        String res ="";
        for(int i = 0;i<word.length();i++)
        {
            if(i+1<word.length() && word.charAt(i) == word.charAt(i+1) && count < 9)
            {
                count++;
            }
            else
            {
                res = res + count + word.charAt(i);
                count = 1;
            }
        }
        return res;
    }
}