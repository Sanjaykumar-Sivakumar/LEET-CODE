class Solution {
    public String longestCommonPrefix(String[] strs) {
    //    Arrays.sort(strs);
    //    String res ="";
   //     String first = strs[0];
  //      String last = strs[strs.length - 1];
//        for(int i = 0;i<first.length();i++)
//        {
 //           if(first.charAt(i) == last.charAt(i))
//            {
 //               res+=first.charAt(i);
 //           }
//            else
  //          {
 //               break;
 //           }
 //       }
  //      return res;
            String s = strs[0];
            for(int i = 1;i<strs.length;i++)
            {
                while(!strs[i].startsWith(s))
                {
                    s = s.substring(0,s.length()-1);
                    if(s.isEmpty())
                    return "";
                }
            }
            return s;

    }
}