class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (!isVowel(arr[i])) {
                i++;
                continue;
            }

            if (!isVowel(arr[j])) {
                j--;
                continue;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' ||
               ch == 'e' || ch == 'E' ||
               ch == 'i' || ch == 'I' ||
               ch == 'o' || ch == 'O' ||
               ch == 'u' || ch == 'U';
    }
}