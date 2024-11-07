class Solution {
    public String makeFancyString(String s) {
        StringBuilder a = new StringBuilder();
        for (char c : s.toCharArray())
        {
            int n = a.length();
            if( n < 2 || c != a.charAt(n - 1) || c != a.charAt(n - 2) )
            {
                a.append(c);
            }
        }
        return a.toString();
        

    }
}