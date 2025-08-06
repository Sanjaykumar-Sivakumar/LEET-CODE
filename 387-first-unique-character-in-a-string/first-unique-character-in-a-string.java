class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        for(int i = 0;i<len;i++)
        {
            boolean flag = true;
            for(int j = 0;j<len;j++)
            {
                if(i!=j && s.charAt(i) == s.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                return i;
            }
        }
        return -1;
    }
}