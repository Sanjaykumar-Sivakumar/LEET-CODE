class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[] = text.split(" ");
        int count = 0;
        //String res= "";
        char ch[] = brokenLetters.toCharArray();
        for(String word: words)
        {
           boolean flag = true;
           for(char b : ch)
           {
            if(word.contains(""+b))
            {
                flag = false;
                break;
            }
           }
              if(flag)
              {
                count++;
              }
           }
       return count;
    }
}