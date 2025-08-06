class Solution {
    public boolean isPowerOfTwo(int n) {
        if(Integer.bitCount(n)==1 && n!=Integer.MIN_VALUE)
        {
            return true;
        }
        return false;
    }
}