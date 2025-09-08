class Solution {
    public String reverseWords(String s) {
      String[] rev = s.trim().split("\\s+");
      String res = "";
      for(int i = rev.length - 1;i>=0;i--)
      {
        res = res + rev[i];
        if(i>0)
        {
            res = res + " ";
        }
      }
      return res;
    }
}
