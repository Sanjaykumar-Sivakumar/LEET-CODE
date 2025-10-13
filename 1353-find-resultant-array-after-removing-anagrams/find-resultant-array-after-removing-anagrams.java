class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        String[] an = new String[n];
        for(int i = 0;i<n;i++)
        {
            String s = words[i];
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            an[i] = new String(ch);
        }
            List<String> lis = new ArrayList<>();
            lis.add(words[0]);
            for(int i = 1;i<n;i++)
            {
            if(!an[i].equals(an[i - 1]))
            {
                lis.add(words[i]);
            }
            }
            return lis;
    }
}