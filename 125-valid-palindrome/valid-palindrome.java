class Solution {
    public boolean isPalindrome(String s) {
        int st = 0;
        int ed = s.length() - 1;
        while(st<ed)
        {
            if(Character.isLetter(s.charAt(st)) && Character.isLetter(s.charAt(ed)))
            {
                if(Character.toLowerCase(s.charAt(st))!= Character.toLowerCase(s.charAt(ed))) return false;
                st+=1;
                ed-=1;
            }
             else if(Character.isDigit(s.charAt(st)) && Character.isDigit(s.charAt(ed)))
            {
                if(s.charAt(st)!= s.charAt(ed)) return false;
                st+=1;
                ed-=1;
            }
            else if(!Character.isLetter(s.charAt(st)) && !Character.isDigit(s.charAt(st)))
            {
                st+=1;
            }
             else if(!Character.isLetter(s.charAt(ed)) && !Character.isDigit(s.charAt(ed)))
            {
                ed-=1;
            }
            else 
                return false;
        }
        return true;
    }
}